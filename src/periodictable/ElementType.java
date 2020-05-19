package periodictable;

public class ElementType {
    private final int atomicNumber;

    public ElementType(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public boolean isMetal() {
        boolean metal = false;
        System.out.println("It's metal! ");
        switch (atomicNumber) {
            case 13:
            case 31:
            case 49:
            case 50:
            case 81:
            case 82:
            case 83:
            case 113:
            case 114:
            case 115:
            case 116:
                metal = true;
        }
        return metal;
    }

    public boolean isSemiMetal() {
        boolean semiMetal = false;
        System.out.println("It's semimetal! ");
        switch (atomicNumber) {
            case 5:
            case 14:
            case 32:
            case 33:
            case 51:
            case 52:
                semiMetal = true;
        }
        return semiMetal;
    }

    public boolean isAlkaliMetal() {
        boolean alkaliMetal = false;
        System.out.println("It's alkalimetal! ");
        switch (atomicNumber) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87:
                alkaliMetal = true;
        }
        return alkaliMetal;
    }

    public boolean isTransitionMetal() {
        System.out.println("It's transition metal!");
        return 21 <= atomicNumber && atomicNumber <= 30
                || 39 <= atomicNumber && atomicNumber <= 48
                || 72 <= atomicNumber && atomicNumber <= 80
                || 104 <= atomicNumber && atomicNumber <= 112;
    }
}
