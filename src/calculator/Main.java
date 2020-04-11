package calculator;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator(10,2);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("division= " + calculator.getDivisionResult());
    }
}