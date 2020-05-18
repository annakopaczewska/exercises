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

    public void giveChange(double chargeAmount) {
        System.out.println("Wait for Your change " + chargeAmount);
        double moneyLeftToPay = chargeAmount;
        for (Map.Entry<Double, Integer> nominal : sortChart()) {
            while (moneyLeftToPay * 100 / 100 >= nominal.getKey()) {
                takeMoney(nominal.getKey(), 1);
                System.out.println(nominal.getKey() + "Bill for ticket");
                moneyLeftToPay -= nominal.getKey();
            }

        }
    }

    public Set<Map.Entry<Double, Integer>> sortChart() {
        Set<Map.Entry<Double, Integer>> entriesSet = cashAvailable.entrySet();
        return entriesSet;
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
        return cashAvailable.get(0.05) < 50 || cashAvailable.get(0.1) < 50 || cashAvailable.get(1.0) < 50
                || cashAvailable.get(2.0) < 30 || cashAvailable.get(5.0) < 10;
    }

    public void checkMoneyAvailability() {
        double totalMoney = 0;
        for (Double e : cashAvailable.keySet()) {
            totalMoney = cashAvailable.get(e) * e + totalMoney;
        }
        String currency = "PLN";
        System.out.format("Total: " + totalMoney);
    }
}

