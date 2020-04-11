package encapsulation;

public class Main {
    public static void main(String[] args) {

        int i = 1;
        int id = i++;
        int id2 = i++;
        int id3 = i++;
        System.out.println(id);
        System.out.println(id2);
        System.out.println(id3);

        Player player = new Player();
        player.name = "Tin";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining= " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("remaining= " + player.healthRemaining());
    }
}
