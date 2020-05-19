package periodictable;

public class Elements {
    private final String name;
    private final int atomicNumber;
    private final double electronegativity;

     Elements(String name, int atomicNumber, double electronegativity) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.electronegativity = electronegativity;
    }

    @Override
    public String toString() {
        return "Elements: " +
                "name= " + name + '\'' +
                ", atomicNumber= " + atomicNumber +
                ", electronegativity= " + electronegativity;
    }
}