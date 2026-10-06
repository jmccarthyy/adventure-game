import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {

        // need to put this into a class called character creation or something and then just call it here - then do the same for each segemnt of the story (into, main, each battle(?), end)
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        String playerName;
        String playerAnswer;
        boolean isHappy = false;

        System.out.println("Please enter your name brave traveller:");

    // Loop for player entering their name
        while(isHappy == false){
            playerName = myScanner.nextLine();
            System.out.println("So your name is " + playerName + "?");
            System.out.println("=========");
            System.out.println("Enter y if you're happy");
            System.out.println("Enter anything else if you're unhappy");

            playerAnswer = myScanner.nextLine();

            if(playerAnswer.equals("y")){
                isHappy = true;
                System.out.println("Perfect - welcome to your adventure, " + playerName);
            } else{
                System.out.println("Oh, that's not your name? My mistake! Please re-enter it:");
            }

        } 



    }   
}