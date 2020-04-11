package thinkjava.ex11_5;

public class Main {
    public static void main(String[] args) {

        Rational rational = new Rational();
        rational.setCounter(10);
        rational.setDenominator(4);
        rational.printRational();

        Rational rational2 = new Rational(rational.getCounter(),20);
        rational2.negate();

        rational2.invert();
        rational2.printRational();

        double doubleValue = rational2.toDouble();
        System.out.println(doubleValue);

        Rational rational3 = new Rational(3,15);
        rational3.printRational();
        rational3.reduce();
        rational3.printRational();

    }
}
