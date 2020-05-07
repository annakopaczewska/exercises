package headfirstjava.chapter11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MIDI {
    public static void main(String[] args) {
        MIDI musicTest = new MIDI();
        musicTest.play();
    }

    public void play() throws MidiUnavailableException {
        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("Have sequencer!");
    }
}
