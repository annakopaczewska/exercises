package headfirstjava.chapter11;

import javax.sound.midi.*;

public class MusicApp {
    public static void main(String[] args) {
        MusicApp musicApp = new MusicApp();
        if (args.length < 2) {
            System.out.println("Don't forget about arguments and note!");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            musicApp.play(instrument, note);
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            MidiEvent midiEvent = null;

            ShortMessage x = new ShortMessage();
            x.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(x, 1);
            track.add(changeInstrument);


            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteP = new MidiEvent(a, 1);
            track.add(noteP);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteK = new MidiEvent(b, 16);
            track.add(noteK);

            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
