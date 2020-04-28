package headfirstjava.chapter2;

public class RecorderTester {
    public static void main(String[] args) {

        Recorder recorder = new Recorder();
        recorder.canRecord = true;
        recorder.recordTape();

        if (recorder.canRecord) {
            recorder.playTape();
        }
    }

    static class Recorder {
        boolean canRecord = false;

        void recordTape() {
            System.out.println("record tape");
        }

        void playTape() {
            System.out.println("play tape");
        }
    }
}
