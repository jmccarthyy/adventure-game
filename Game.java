import java.util.Scanner;
import java.util.HashMap;

public class Game {
    
    public static void main(String[] args) {

        // need to put this into a class called character creation or something and then just call it here - then do the same for each segemnt of the story (into, main, each battle(?), end)
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        String playerName;
        String playerAnswer;
        boolean isHappy = false;

        //Create and fill out Character Stats HashMap:
        HashMap<String, Integer> charStats = new HashMap<>();

        charStats.put("Skill", 0);
        charStats.put("Health", 0);
        charStats.put("Luck", 0);

        //Start Game:

        System.out.println("Please enter your name brave traveller:");

        // Loop for player entering their name
        while(isHappy == false){
            playerName = myScanner.nextLine();
            System.out.println("So your name is " + playerName + "?");
            System.out.println("=========");
            System.out.println("Enter y if you're happy,");
            System.out.println("Enter anything else if you're unhappy:");
            System.out.println("=========");

            playerAnswer = myScanner.nextLine();

            if(playerAnswer.equals("y")){
                isHappy = true;
                System.out.println("Perfect - welcome, " + playerName + "!");
            } else{
                System.out.println("Oh, that's not your name? My mistake! Please re-enter it:");
            }

        } 

        isHappy = false;

        //Section for deciding player stats:
        System.out.println("=========");
        System.out.println("In this game, you will encounter various beasts that are not here to make friends...");
        //Explain each stat and what they do
        System.out.println("Now you need to roll some dice to decide your stats");
        System.out.println("=========");
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
                System.out.println("========");
                System.out.println("First, roll 1 of the dice to decide your Skill stat (this represents your combat strength)");
                System.out.println("Enter the number below:");
                String statAnswer = myScanner.nextLine();
                //Loop to see if they definitey want to add that number
                //If so, and it passes validation to make sure it's actually a number:
                Integer parsedSkill = Integer.parseInt(statAnswer);
                Integer skillStat = parsedSkill + 6;
                charStats.put("Skill", skillStat);
                System.out.println("This means your Skill stat is: " + charStats.get("Skill"));
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
                System.out.println("Finally, roll 1 of the dice to decide your Luck stat (this represents your character's luck in life)");
                statAnswer = myScanner.nextLine();
                Integer parsedLuck = Integer.parseInt(statAnswer);
                Integer luckStat = parsedLuck + 6;
                charStats.put("Luck", luckStat);
                System.out.println("This means your Luck stat is: " + charStats.get("Luck"));
                //Happy with your rolls? If not, do them again

            } else if(playerAnswer.equals("p")){
                //Haven't started this one yet
                System.out.println("So you want me to roll the dice?");
                System.out.println("Perfect!");
                System.out.println("Don't worry - it's completely random! (I promise)");
            } else{
                //This one should be okay to just leave as is
                System.out.println("That isn't an option I'm afraid!");
            }
        }



    }   
}