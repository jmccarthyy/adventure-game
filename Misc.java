import java.util.Scanner;

public class Misc {

    Scanner oneScanner = new Scanner(System.in);

    public void characterCreated(Character player) {

        System.out.println("Your character is now created:");
        System.out.println("=================");
        System.out.println("Your Name is " + player.name);
        System.out.println("Your Health is " + player.playerHealth);
        System.out.println("Your Skill is " + player.playerSkill);
        System.out.println("Your Luck is " + player.playerLuck);
        System.out.println("You have " + player.gold + " gold");
        System.out.println("You have " + player.provisions + " provisions");
        System.out.println("=================");

        System.out.println("Press enter to continue...");
        System.out.println("====================");
        oneScanner.nextLine();
    }


}