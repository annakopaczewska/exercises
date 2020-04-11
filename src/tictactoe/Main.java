package tictactoe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTaCToe game = new TicTaCToe();
        game.initializeBoard();
        System.out.println("Let's play the Tic-Tac-Toe!");
        do {
            game.printBoard();
            int row;
            int col;
            do {
                System.out.println("Player enter an empty row and column to place your mark!");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }
            while (game.placeMark(row, col));
            game.changePlayer();
        }
        while (game.isWinner() && game.fullBoard());
        if (game.fullBoard() && game.isWinner()) {
            System.out.println("DRAW!");
        } else {
            System.out.println("Current board: ");
            game.printBoard();
            game.changePlayer();
            System.out.println("WINS!");
        }
    }
}
