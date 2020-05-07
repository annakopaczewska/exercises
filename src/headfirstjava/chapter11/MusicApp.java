package headfirstjava.chapter11;

import javax.sound.midi.*;

public class MusicApp {
    public static void main(String[] args) {
        MusicApp musicApp = new MusicApp();
        musicApp.play();
    }

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteP = new MidiEvent(a, 1);
            track.add(noteP);


            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteK = new MidiEvent(b, 16);
            track.add(noteK);

            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
