package exBasicI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class decToHex {
    public static void main(String[] args) {

        int decNum = 15;
        int rem;
        String hexNum = "";

        // hexadecimal number digits
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.print("Input a decimal number: " + decNum);
        System.out.println();

        while (decNum > 0) {
            rem = decNum % 16;
            hexNum = hex[rem] + hexNum;
            decNum = decNum / 16;
        }
        System.out.print("Hexadecimal number is : " + hexNum);
    }
}