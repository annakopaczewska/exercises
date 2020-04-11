package complexOperations;

public class Main {
    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        one.add(1, 2);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        ComplexNumber number = new ComplexNumber(2.5, -0.5);
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
