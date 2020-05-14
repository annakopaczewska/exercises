package ticketmachine;

import java.util.*;

public class MoneyFeeder {

    private HashMap<Double, Integer> cashAvailable = new HashMap<Double, Integer>();


    public void putMoney(double nominal, int quantity) {
        try {
            cashAvailable.put(nominal, (quantity + cashAvailable.get(nominal)));
        } catch (NullPointerException exception) {
            cashAvailable.put(nominal, quantity);
        }
    }

    public void takeMoney(double nominal, int quantity) {
        if (!(cashAvailable.get(nominal) - quantity < 0)) {
            cashAvailable.put(nominal, cashAvailable.get(nominal) - quantity);
        }
    }

    public boolean isMachineAvailable() {
        for (Double nominalQuantity : cashAvailable.keySet()) {
            if (safetyNominalStock()) {
                System.out.println("Sorry, machine out of order!");
                return false;
            }
        }
        return true;
    }

    public boolean safetyNominalStock() {
        return cashAvailable.get(1.0) < 50 || cashAvailable.get(2.0) < 30 || cashAvailable.get(5.0) < 10;
    }

    public void checkMoneyAvailability() {

    }
}

