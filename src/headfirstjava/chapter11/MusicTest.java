package headfirstjava.chapter11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class MusicTest {
    public static void main(String[] args) {
        MusicTest musicTest = new MusicTest();
        musicTest.play();
    }

    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Have sequencer!");
        } catch (MidiUnavailableException exception){
            System.out.println("Have problem! :( ");
        }
    }
}
