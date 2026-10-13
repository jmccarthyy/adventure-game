import java.util.Scanner;
import java.util.HashMap;

public class Character{

    String name;
    Integer playerHealth;
    Integer playerSkill;
    Integer playerLuck;
    Integer gold;
    boolean isDead;

    public Character(String name, Integer playerHealth, Integer playerSkill, Integer playerLuck, Integer gold, boolean isDead) {
        this.name = name;
        this.playerHealth = playerHealth;
        this.playerSkill = playerSkill;
        this.playerLuck = playerLuck;
        this.gold = gold;
        this.isDead = isDead;

    }

    //Add a class that prints the player's stats, including currnt healht, skill, luck, gold and inventory when the player types "i"

}