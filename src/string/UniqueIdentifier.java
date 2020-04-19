package string;

public class UniqueIdentifier {
    public static void main(String[] args) {
        String string = "Java exercises";
        uniqueIdentifier(string);

    }

    public static void uniqueIdentifier(String string) {
        int hashCode = string.hashCode();
        System.out.println("Hash for " + string + "is = " + hashCode);
    }
}
