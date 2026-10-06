import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {

        // need to put this into a class called character creation or something and then just call it here - then do the same for each segemnt of the story (into, main, each battle(?), end)
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        String playerName;
        String playerAnswer;

        System.out.println("Please enter your name brave traveller:");

        playerName = myScanner.nextLine();

        System.out.println("So your name is " + playerName + "?");

        playerAnswer = myScanner.nextLine();


    //need to find out how to make this code loop until the player is happy with their name
        if(playerAnswer.equals("Y")){
            System.out.println("Perfect!");
        } 
        else{
            System.out.println("In that case, re-enter your name");

            playerName = myScanner.nextLine();

            return;
        }

    }   
}