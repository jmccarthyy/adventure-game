import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class CharacterCreation {

    Scanner myScanner = new Scanner(System.in);

    String playerName;
    String playerAnswer;
    boolean isHappy = false;
    Integer gold = 0;
    Integer provisions = 0;
    boolean isDead = false;
    String weaponName;
    Integer weaponSkill;

    HashSet<String> inventory = new HashSet<>();

    //Create and fill out Character Stats HashMap:
    HashMap<String, Integer> charStats = new HashMap<>();

    public void nameCharacter() {

        System.out.println("Please enter your name brave traveller:");

        // Loop for player entering their name
        while(isHappy == false){
            playerName = myScanner.nextLine();
            System.out.println("So your name is " + playerName + "?");
            System.out.println("=========");
            System.out.println("Enter y if this is right,");
            System.out.println("Enter anything else if this is wrong:");
            System.out.println("=========");

            playerAnswer = myScanner.nextLine();

            if(playerAnswer.equals("y")){
                isHappy = true;
                System.out.println("Perfect - welcome, " + playerName + "!");
            } else{
                System.out.println("Oh, that's not your name? My mistake! Please re-enter it:");
            }

        }
    }

    public void rollStats(){

        charStats.put("Skill", 0);
        charStats.put("Health", 0);
        charStats.put("Luck", 0);
        isHappy = false;

        //Section for deciding player stats:
        System.out.println("=========");
        System.out.println("In this game, you will encounter various beasts that are not here to make friends...");
        //Explain each stat and what they do
        System.out.println("Now you need to roll some dice to decide your stats");
        while(isHappy == false){
            System.out.println("Are you rolling physical dice, or do you want me to roll them virtually?");
            System.out.println("=========");
            System.out.println("Enter p if you're rolling physical dice,");
            System.out.println("or enter r if you want me to roll the dice:");
            System.out.println("=========");

            playerAnswer = myScanner.nextLine();

            if(playerAnswer.equals("p")){
                //Will need to ask if they're happy - if yes, save isHappy to true and will then need a new while loop to see if they're happy when entering their stats
                System.out.println("So you're rolling the dice yourself?");
                System.out.println("Okay, let's do it - you'll need 2 dice!");
                
                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                System.out.println("First, roll 1 of the dice to decide your Skill stat (this represents your combat strength)");
                System.out.println("Enter the number below:");
                String statAnswer = myScanner.nextLine();
                //Loop to see if they definitey want to add that number
                //If so, and it passes validation to make sure it's actually a number:
                Integer parsedSkill = Integer.parseInt(statAnswer);
                Integer skillStat = parsedSkill + 6;
                charStats.put("Skill", skillStat);
                System.out.println("This means your Skill stat is: " + charStats.get("Skill"));

                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                System.out.println("Next, roll 2 of the dice to decide your Health stat (this represents your character's health)");
                System.out.println("Enter the first number below:");
                String healthRollOne = myScanner.nextLine();
                System.out.println("Enter the second number below:");
                String healthRollTwo = myScanner.nextLine();
                //Loop to see if they definitey want to add that number
                //If so, and it passes validation to make sure it's actually a number:
                Integer parsedHealthAnswerOne = Integer.parseInt(healthRollOne);
                Integer parsedHealthAnswerTwo = Integer.parseInt(healthRollTwo);
                Integer finalHealthScore = (parsedHealthAnswerOne + parsedHealthAnswerTwo) + 12;
                charStats.put("Health", finalHealthScore);
                System.out.println("This means your Health stat is: " + charStats.get("Health"));

                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                System.out.println("Finally, roll 1 of the dice to decide your Luck stat (this represents your character's luck in life)");
                statAnswer = myScanner.nextLine();
                Integer parsedLuck = Integer.parseInt(statAnswer);
                Integer luckStat = parsedLuck + 6;
                charStats.put("Luck", luckStat);
                System.out.println("This means your Luck stat is: " + charStats.get("Luck"));
                //Happy with your rolls? If not, do them again
                isHappy = true;

            } else if(playerAnswer.equals("r")){
                System.out.println("So you want me to roll the dice?");
                System.out.println("Perfect!");
                System.out.println("Don't worry - it's completely random! (I promise)");

                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                //Dice roll simulation here:
                System.out.println("First, let's roll for your Skill stat");

                System.out.println("====================");
                System.out.println("Press enter to roll...");
                System.out.println("====================");
                myScanner.nextLine();

                Integer skillDice = (int)(Math.random()* 6 + 1);
                Integer skill = skillDice + 6;
                charStats.put("Skill", skill);
                System.out.println("You rolled a " + skillDice + ", which means your Skill stat is " + skill);

                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                System.out.println("Next, let's roll for your Health stat");
                System.out.println("====================");
                System.out.println("Press enter to roll...");
                System.out.println("====================");
                myScanner.nextLine();
                Integer healthDiceOne = (int)(Math.random()* 6 + 1);
                Integer healthDiceTwo = (int)(Math.random()* 6 + 1);
                Integer health = (healthDiceOne + healthDiceTwo) + 12;
                charStats.put("Health", health);
                System.out.println("You rolled a " + healthDiceOne + " and a " + healthDiceTwo + ", which means your Health stat is " + health);

                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                System.out.println("Next, let's roll for your Luck stat");
                System.out.println("====================");
                System.out.println("Press enter to roll...");
                System.out.println("====================");
                myScanner.nextLine();
                Integer luckDice = (int)(Math.random()* 6 + 1);
                Integer luck = luckDice + 6;
                charStats.put("Luck", luck);
                System.out.println("You rolled a " + luckDice + ", which means your Skill stat is " + luck);

                System.out.println("====================");
                System.out.println("Press enter to continue...");
                System.out.println("====================");
                myScanner.nextLine();

                isHappy = true;

            } else{
                //This one should be okay to just leave as is
                System.out.println("That isn't an option I'm afraid!");
                System.out.println("====================");
            }
        }
    }


}