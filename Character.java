import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class Character{

    String name;
    Integer playerHealth;
    Integer playerSkill;
    Integer playerLuck;
    Integer gold;
    Integer provisions;
    HashSet<String> inventory;
    boolean isDead;

    public Character(String name, Integer playerHealth, Integer playerSkill, Integer playerLuck, Integer gold, Integer provisions, HashSet<String> inventory, boolean isDead) {
        this.name = name;
        this.playerHealth = playerHealth;
        this.playerSkill = playerSkill;
        this.playerLuck = playerLuck;
        this.gold = gold;
        this.provisions = provisions;
        this.inventory = inventory;
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
        System.out.println("You have " + player.provisions + " provisions");
        if(player.inventory.isEmpty()){
            System.out.println("You have nothing in your inventory");
        } else if(!player.inventory.isEmpty()){
            System.out.println("Your inventory consists of" + player.inventory);
        }
        System.out.println("=================");
        } else if(player.isDead == true){
            System.out.println("Oh no... You are dead...");
        }

    }

}