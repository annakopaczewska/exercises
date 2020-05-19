package periodictable;

public class ChemicalElement {
    private String name;
    private String symbol;
    private int atomicNumber;
    private double electonegativity;


    public ChemicalElement(String name, String symbol, int atomicNumber, double electonegativity) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.electonegativity = electonegativity;
    }

    public ChemicalElement() {
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getElectonegativity() {
        return electonegativity;
    }

    @Override
    public String toString() {
        return "ChemicalElement: \n" +
                "name= " + name + '\n' +
                "symbol='" + symbol + '\n' +
                "atomicNumber=" + atomicNumber + '\n' +
                "electonegativity= " + electonegativity;
    }


    public int compareTo(Object o) {
        ChemicalElement element = (ChemicalElement) o;
        if (Math.abs(electonegativity - element.electonegativity) <= 0.000000000001) {
            return 0;
        } else if (electonegativity < element.electonegativity) {
            return -1;
        } else {
            return 1;
        }
    }
}
