import java.util.Scanner;
import java.util.HashMap;

public class Game {
    
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        //Start Game: 
        CharacterCreation characterCreation = new CharacterCreation(inputScanner);

        characterCreation.nameCharacter();

        characterCreation.rollStats();

        Weapon weapon = new Weapon("", 0);

        //New instance of Character class (uses the constructor):
        Character player = new Character(characterCreation.playerName, characterCreation.charStats.get("Health"), characterCreation.charStats.get("Max Health"), characterCreation.charStats.get("Skill"),characterCreation.charStats.get("Luck"), characterCreation.gold, characterCreation.provisions, characterCreation.inventory, characterCreation.isDead, weapon, inputScanner);

        Misc misc = new Misc(inputScanner);

        misc.characterCreated(player);

        System.out.println("You have now created your character...");
        System.out.println("Press enter to begin your journey...");
        System.out.println("====================");
        inputScanner.nextLine();

        Story story = new Story(inputScanner);
        
        story.storyIntro(player);

        if(player.deathCheck()){
            return;
        }

    }   
}