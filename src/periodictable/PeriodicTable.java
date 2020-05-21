package periodictable;

import java.util.Arrays;
import java.util.List;

public class PeriodicTable {
    public static final int MAX = 118;
    private List<ChemicalElement> elem;

    public PeriodicTable() {
        List<ChemicalElement> elem = Arrays.asList(
                new ChemicalElement("hydrogen", "H", 1, 2.20),
                new ChemicalElement("oxygen", "O", 8, 3.44),
                new ChemicalElement("potassium", "K", 19, 0.82));
    }

    public List<ChemicalElement> getAllElements(List<ChemicalElement> elem) {
        for (ChemicalElement chemicalElement : elem) {
            System.out.println("All elements: " + chemicalElement);
        }
        return elem;
    }
}