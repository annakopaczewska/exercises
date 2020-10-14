package projects.guessinggame;

import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        int userNum = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;
        while (userNum != computerNumber) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userNum = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userNum, computerNumber, count));
            count++;
        }
    }

    public static String determineGuess(int userNum, int computerNum, int count) {
        if (userNum <= 0 || userNum > 100) {
            return "Your guess is invalid";
        } else if (userNum == computerNum) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (userNum > computerNum) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
    }
}
