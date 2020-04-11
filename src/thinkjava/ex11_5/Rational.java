package thinkjava.ex11_5;

public class Rational {

    private int counter;
    private int denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(int counter, int denominator) {
        this.counter = counter;
        this.denominator = denominator;
    }

    public int getCounter() {
        return this.counter;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void printRational() {
        System.out.println(this.counter + "/" + this.denominator);
    }

    public String toString() {
        return "rational= " + this.counter + "/" + this.denominator;
    }

    public void negate() {
        this.counter = -this.counter;
    }

    public void invert() {
        this.counter = this.counter + this.denominator;
        this.denominator = this.counter - this.denominator;
        this.counter = this.counter - this.denominator;
    }

    public double toDouble() {
        return (double) this.counter / this.denominator;
    }

    public void reduce() {
        int gcd = gcd(this.counter, this.denominator);
        this.counter = this.counter / gcd;
        this.denominator = this.denominator / gcd;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int value = a % b;
        return gcd(b, value);
    }

    public Rational add(Rational rational) {
        int newCounter = this.counter * rational.denominator + rational.counter + this.denominator;
        int newDenominator = this.denominator * rational.denominator;
        rational.reduce();
        return rational;
    }
}
