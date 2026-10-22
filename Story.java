import java.util.Scanner;
import java.util.HashMap;

public class Story {

    Scanner storyScanner = new Scanner(System.in);

    String storyAnswer;

    public void storyIntro(Character player) {
        
        //This method contains the intro to the story but I haven't come up with that yet...
        System.out.println("You awaken in a cold sweat. You look around and see that you're in a small wooden hut. All it houses is a table, a chair, a wardrobe and the bed in which you lay. What do you do?");
        System.out.println("====================");
        System.out.println("Press enter to continue...");
        System.out.println("====================");
        storyScanner.nextLine();
        System.out.println("What do you do?");
        System.out.println("a). To open the wardrobe");
        System.out.println("b). To open the front door");

        storyAnswer = storyScanner.nextLine();

        if(storyAnswer.equals("a")){
            //code - you get dressed, pick up your sword, collect your 10 gold and put on your empty backpack
            System.out.println("You walk over to the wardrobe and open it...");
            System.out.println("You find clothes, a sword, an empty leather bag and a small bag containing 10 gold pieces");
            System.out.println("====================");
            // here, need to add the gold pieces and weapon to your character
            player.gold += 10;
            Weapon sword = new Weapon("Sword", 1);
            player.inventory.add(sword);
            player.weapon = sword;
            player.inventory.add(new Potion("a Potion of Healing", 10));
            System.out.println("Press enter to continue...");
            System.out.println("====================");
            storyScanner.nextLine();

        } else if (storyAnswer.equals("b")){
            //code - a creature is outside but you die because you have no way to defend yourself
        }

    }

}
