import java.util.Scanner;
import java.util.HashMap;

public class Game {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // need to put this into a class called character creation or something and then just call it here - then do the same for each segemnt of the story (into, main, each battle(?), end)

        //Start Game: 
        CharacterCreation characterCreation = new CharacterCreation();

        characterCreation.nameCharacter();

        characterCreation.rollStats();


        

        


        System.out.println("You have now created your character...");
        System.out.println("Press enter to begin your journey...");
        System.out.println("====================");
        scanner.nextLine();
        




    }   
}