package periodictable;

public class Main {
    public static void main(String[] args) {

        ElementType elementType = new ElementType(13);
        System.out.println(elementType.isMetal());
        System.out.println(elementType.isSemiMetal());
        ElementType elementType3 = new ElementType(21);
        System.out.println(elementType3.isAlkaliMetal());
        System.out.println(elementType3.isTransitionMetal());

        ChemicalElement chemicalElement = new ChemicalElement();
        PeriodicTable periodicTable = new PeriodicTable();
        
    }
}