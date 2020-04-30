package headfirstjava.chapter6;

import java.util.ArrayList;

public class Check {
    static class EasyGame {
        private ArrayList positionField;

        public void setPositionField(ArrayList pf) {
            positionField = pf;
        }

        public String check(String move) {
            String result = "mishit";
            int index = positionField.indexOf(move);

            if (index >= 0) {
                positionField.remove(index);
            }
            if (positionField.isEmpty()) {
                result = "sunk";
            } else {
                result = "hit!";
            }
            return result;
        }
    }
}
