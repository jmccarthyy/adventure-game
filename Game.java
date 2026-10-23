import java.util.Scanner;
import java.util.HashMap;

public class Game {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Start Game: 
        CharacterCreation characterCreation = new CharacterCreation();

        characterCreation.nameCharacter();

        characterCreation.rollStats();

        Weapon weapon = new Weapon("", 0);

        //New instance of Character class (uses the constructor):
        Character player = new Character(characterCreation.playerName, characterCreation.charStats.get("Health"), characterCreation.charStats.get("Skill"),characterCreation.charStats.get("Luck"), characterCreation.gold, characterCreation.provisions, characterCreation.inventory, characterCreation.isDead, weapon);

        Misc misc = new Misc();

        misc.characterCreated(player);

        System.out.println("You have now created your character...");
        System.out.println("Press enter to begin your journey...");
        System.out.println("====================");
        scanner.nextLine();

        Story story = new Story();
        
        story.storyIntro(player);

        if(player.deathCheck()){
            return;
        }

    }   
}