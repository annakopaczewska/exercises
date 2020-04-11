package thinkjava.ex11_3;

public class Tile {
    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return this.letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void printTile(Tile title) {
        System.out.println("letter= " + title.letter + " value= " + title.value);
    }

    public static Tile testTile() {
        Tile title = new Tile('Z', 10);
        printTile(title);
        return title;
    }

    public String toString() {
        return "tile = " + this.letter + " value=" + this.value;
    }

    public boolean equals(Tile that) {
        return this.letter == that.letter && this.value == that.value;
    }
}