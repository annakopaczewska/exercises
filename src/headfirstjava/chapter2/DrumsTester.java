package headfirstjava.chapter2;

public class DrumsTester {
    public static void main(String[] args) {
        Drums drums = new Drums();

        drums.playDrums();
        drums.drum = false;
        drums.playPlate();

        if (drums.drum == true) {
            drums.playDrums();
        }
    }

    static class Drums {
        boolean plate = true;
        boolean drum = true;

        void playDrums() {
            System.out.println("bam, bam, baaaa-am-am");
        }

        void playPlate() {
            System.out.println("brzędk, brrzzzzdęk");
        }
    }
}
