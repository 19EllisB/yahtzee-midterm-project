import java.util.ArrayList;
import java.util.Scanner;

public class Yahtzee {
    ArrayList<Player> players = new ArrayList<Player>();
    Dice[] rollDice = new Dice[5]; //The main set of game dice
    ArrayList<Dice> flaggedDice = new ArrayList<Dice>(5);
    /*
     * Used for storing the presence detections of specific 
     * combos for the use of detecting combos like full house.
     * i.e. if flaggedKinds[2] and flaggedKinds[3] are flagged true
     * full house is present
     */
    boolean[] flaggedKinds = { 
        false, //0's, always false
        false, //1's, always false
        false, //pairs
        false, //threes
        false, //fours
        false  //yahtzees
    };
    
    public Yahtzee() {
        int playerCount;
        //Gets Number of Players
        System.out.println("How many players do we have today?");
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNextInt()) {
            System.out.println("Please enter a valid # of players.");
            userInput.nextLine();
        }
        playerCount = userInput.nextInt();
        while (playerCount < 1 || playerCount > 4){
            System.out.println("Please enter a valid # of players (1-4)");
            while (!userInput.hasNextInt()) {
                System.out.println("Please enter a valid # of players.");
                userInput.nextLine();
            }
            playerCount = userInput.nextInt();
        }
        //Populates players w/ Player objects and gives them names
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player());
            players.get(i).username = "Player " + Integer.toString(i + 1);
        }
    }
}