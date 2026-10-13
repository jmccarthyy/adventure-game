import java.util.Scanner;
import java.util.HashMap;

public class Story {

    Scanner storyScanner = new Scanner(System.in);

    char storyAnswer;

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

        storyAnswer = myScanner.nextLine();

        if(storyAnswer.equals("a")){
        //code

        } else if (storyAnswer.equals("b")){
            //code
        }

    }

}
