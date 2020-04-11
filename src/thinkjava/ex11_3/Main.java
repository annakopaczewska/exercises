package thinkjava.ex11_3;

public class Main {
    public static void main(String[] args) {

        Tile tile = Tile.testTile();
        tile.setValue(30);
        System.out.println(tile.equals(Tile.testTile())+ " " + tile.getLetter());


    }
}
