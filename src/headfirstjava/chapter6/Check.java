package headfirstjava.chapter6;

public class Check {
    public static void main(String[] args) {
        EasyGame easyGame = new EasyGame();
        int[] position = {2, 3, 4};
        easyGame.setPositionField(position);
        String chooseField = "2";
        String result = easyGame.check(chooseField);

    }

    static class EasyGame {
        int[] positionField;
        int numberHits;

        public void setPositionField(int[] pf) {
            positionField = pf;
        }

        public String check(String stringField) {
            int field = Integer.parseInt(stringField);

            String result = "mishit";

            for (int value : positionField) {
                if (field == value) {
                    result = "Hit!";
                    numberHits++;
                    break;
                }
            }
            if (numberHits == positionField.length) {
                result = "sunk";
            }
            System.out.println(result);
            return result;
        }
    }
}
