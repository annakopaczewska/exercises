package exBasicI;

public class decToOct {
    public static void main(String[] args) {

        int decNum = 15;
        int rem;
        String octNum = "";

        // hexadecimal number digits
        char oct[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        System.out.print("Input a decimal number: " + decNum);
        System.out.println();

        while (decNum > 0) {
            rem = decNum % 8;
            octNum = oct[rem] + octNum;
            decNum = decNum / 8;
        }
        System.out.print("Octal number is : " + octNum);
    }
}