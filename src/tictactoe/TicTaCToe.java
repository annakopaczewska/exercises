package tictactoe;

public class TicTaCToe {
    private char[][] board;
    private char currentPlayer;

    public TicTaCToe() {
        board = new char[3][3];
        currentPlayer = 'x';
        initializeBoard();
    }

    // metoda ta sprawdza czy pola są zapełnione
    public boolean initializeBoard() {
        for (int i = 0; i < 3; i++) { // pętla po wersach
            for (int j = 0; j < 3; j++) {  // pętla po kolumnach
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    // drukuje obecną tablice
    public void printBoard() {
        System.out.println("---------------");

        for (int i = 0; i < 3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

    // pętla po wszstkich komórkach planszy, gdy jest pusta to zwroci false - inaczej jest pelna
    public boolean fullBoard(){
        boolean isFull = true;

        for(int i =0; i<3; i++){
            for (int j=0; j<3; i++){
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }



    // gdy gracz wygra grę, ta metoda zwróci prawdę
    public boolean isWinner() {
        return (checkRows() || checkColumns() || checkDiagonal());
    }

    //    // metoda sprawdzająca wiersze
    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    // metoda sprawdzająca kolumny
    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    // metoda sprawdzająca przekątną
    private boolean checkDiagonal() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) == true ||
                (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }

    // metoda sprawdza czy trzy okreslone znaki w wierszach i kolumnach zawieraja podobna litere, jesli tak to zwraca true
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != ' ') && (c1 == c2) && (c2 == c3)); // sprawdzam czy pierwsza instrukcja nie jest pusta, jesli jest to powonuje z nastepna wartoscia itd
    }

    // metoda umieści znam w okreslonej komórce ze znakami bierzącymi gracza
    public boolean placeMark(int row, int col) {
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayer;
                    return true;
                }
            }
        }
        return false;
    }

    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}