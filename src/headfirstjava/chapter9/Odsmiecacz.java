package headfirstjava.chapter9;

public class Odsmiecacz {
    public static void main(String[] args) {
        Odsmiecacz odsm1;
        Odsmiecacz odsm2 = new Odsmiecacz();
        Odsmiecacz odsm3 = new Odsmiecacz();
        Odsmiecacz odsm4 = odsm3;

        odsm1 = toWork();
        odsm2 = null;
    }

    public static Odsmiecacz toWork(){
        Odsmiecacz odsmiecacz = new Odsmiecacz();
        toWork2(odsmiecacz);
        return odsmiecacz;

    }

    private static void toWork2(Odsmiecacz odsmiecacz) {
        Odsmiecacz localOdsmiecacz;
    }
}
