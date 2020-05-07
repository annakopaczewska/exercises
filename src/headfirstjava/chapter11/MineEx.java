package headfirstjava.chapter11;

class MineEx extends Throwable {
    public static void main(String[] args) {
        String test = args[0];
        try {
            System.out.println("p");
            gamble(test);
            System.out.println("a");
        } catch (MineEx ex) {
            System.out.println("a");
        } finally {
            System.out.println("n");
        }
        System.out.println("a");
    }

    static void gamble(String t) throws MineEx {
        System.out.println("i");

        if ("nie".equals(t)) {
            throw new MineEx();
        }
        System.out.println("j");
    }
}
