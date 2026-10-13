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

    public void status(Character player){
        if(player.isDead == false){
        System.out.println("This is your status, as things stand:");
        System.out.println("=================");
        System.out.println("Your Name is " + player.name);
        System.out.println("Your Health is " + player.playerHealth);
        System.out.println("Your Skill is " + player.playerSkill);
        System.out.println("Your Luck is " + player.playerLuck);
        System.out.println("You have " + player.gold + " gold");
        System.out.println("=================");
        } else if(player.isDead == true){
            System.out.println("Oh no... You are dead...");
        }

    }

    //Add a class that prints the player's stats, including currnt healht, skill, luck, gold and inventory when the player types "i"

}