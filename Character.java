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
    HashSet<Item> inventory;
    boolean isDead;
    Weapon weapon;
    Scanner inputScanner;

    public Character(String name, Integer playerHealth, Integer playerSkill, Integer playerLuck, Integer gold, Integer provisions, HashSet<Item> inventory, boolean isDead, Weapon weapon, Scanner inputScanner) {
        this.name = name;
        this.playerHealth = playerHealth;
        this.playerSkill = playerSkill;
        this.playerLuck = playerLuck;
        this.gold = gold;
        this.provisions = provisions;
        this.inventory = inventory;
        this.isDead = isDead;
        this.weapon = weapon;
        this.inputScanner = inputScanner;
    }

    public void showInventory(){
        if(this.inventory.isEmpty()){
            System.out.println("You have nothing in your inventory");
        } else{
            System.out.println("Your inventory:");
            for(Item item : this.inventory){
                if(item == this.weapon){
                    System.out.println("- " + item.name + " (Currently Equipped)");
                }
                else{
                    System.out.println("- " + item.name);
                }
            }
        }
    }

    public void status(){
        if(!this.isDead){
        System.out.println("This is your status, as things stand:");
        System.out.println("=================");
        System.out.println("Your Name is " + this.name);
        System.out.println("Your Health is " + this.playerHealth);
        System.out.println("Your Skill is " + this.playerSkill);
        System.out.println("Your Luck is " + this.playerLuck);
        System.out.println("You have " + this.gold + " gold");
        System.out.println("You have " + this.provisions + " provisions");
        this.showInventory();
        if(this.weapon.name.isEmpty()){
            System.out.println("You are unequipped");
        } else{
            System.out.println("You have " + this.weapon.name + " equipped (This adds +" + this.weapon.addedSkill + " skill in combat)");
        }
        System.out.println("=================");
        } else if(this.isDead){
            System.out.println("Oh no... You are dead...");
        }

    }

    public boolean deathCheck(){
        if(this.isDead){
            System.out.println("=================");
            System.out.println("GAME OVER");
            System.out.println("=================");
            System.out.println("You have died...");
            System.out.println("=================");
            return true;
        }
        return false;
    }

    public boolean options(String storyAnswer) {
        storyAnswer.trim();
        if(storyAnswer.equals("status")){
            this.status();
            return true;
        } else if(storyAnswer.equals("inventory")){
            this.showInventory();
            return true;
        } else if(storyAnswer.equals("use")){
            //use
            this.showInventory();
            System.out.println("=================");
            System.out.println("Which item would you like to use?");
            System.out.println("=================");
            //Scanner to get user input

            return true;
        } else if(storyAnswer.equals("provision")){
            //provision
            Integer provisionNumber = 0;
            System.out.println("=================");
            System.out.println("You currently have" + this.provisions + "provisions");
            System.out.println("=================");
            System.out.println("How many would you like to eat?");
            System.out.println("=================");
            //provisionNumber = scanner input
            if(provisionNumber >= this.provisions){
                //Check they want to eat that number of provisions
                //If health provided from provisions is higher than max possible base Health (their original roll), tell them and only allow them to eat as many as is allowed
            } else{
                System.out.println("You do not have enough provisions!");
                System.out.println("=================");
            }

            return true;
        } else if(storyAnswer.equals("commands")){
            System.out.println("=================");
            System.out.println("The commands you can run are as follows:");
            System.out.println("=================");
            System.out.println("1). 'status' - typing status will show your charcater's current status, including your current Health, Skill, and Luck points, your gold, your provisions, your current inventory, and your equipped weapon");
            System.out.println("2). 'inventory' - typing inventory will show your current inventory");
            System.out.println("3). 'use' - typing use will let you pick an item you wish to use");
            System.out.println("4). 'provision' - typing provision will allow you to pick an amount of provisions to consume, healing you");
            System.out.println("=================");
            return true;
        }
        return false;
    }
}