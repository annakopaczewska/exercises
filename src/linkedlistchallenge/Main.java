package linkedlistchallenge;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {


        Album album = new Album("Storm", "Deep Purple");
        album.addSong("Storm", 4.6);
        album.addSong("Love", 3.56);
        album.addSong("Bread", 3.57);
        album.addSong("Hold on", 4.23);
        album.addSong("The gypsy", 4.0);
        album.addSong("Soldier of fortune", 3.13);

        album = new Album("Mirrors", "Justin Timberlake");
        album.addSong("Rehab", 3.14);
        album.addSong("Cry me a river", 4.18);
        album.addSong("Seniorita", 3.34);
        album.addSong("What goes around", 6.57);
        album.add(album);



    }


}