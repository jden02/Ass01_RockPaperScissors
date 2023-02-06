import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerOne;
        String playerTwo;
        String playAgain;
        do {
            // Player One inputs and error check
            do {
                System.out.println("Player one (R, P, S): ");
                playerOne = sc.nextLine();
                if (!(playerOne.equalsIgnoreCase("R") || playerOne.equalsIgnoreCase("P") || playerOne.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid Input. Please Try again.");
                }
            } while (!(playerOne.equalsIgnoreCase("R") || playerOne.equalsIgnoreCase("P") || playerOne.equalsIgnoreCase("S")));

            // Player Two inputs and error check
            do {
                System.out.println("Player two (R, P, S): ");
                playerTwo = sc.nextLine();
                if (!(playerTwo.equalsIgnoreCase("R") || playerTwo.equalsIgnoreCase("P") || playerTwo.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid Input. Please Try again.");
                }
            } while (!(playerTwo.equalsIgnoreCase("R") || playerTwo.equalsIgnoreCase("P") || playerTwo.equalsIgnoreCase("S")));

            //Using cross product method to find the winner.
            if(playerOne.equalsIgnoreCase("R")){
                if(playerTwo.equalsIgnoreCase("R")){
                    System.out.println("Rock vs. Rock. It's a tie!");
                }else if(playerTwo.equalsIgnoreCase("P")){
                    System.out.println("Paper covers rock. Player two wins!");
                }else{ // player two Scissors
                    System.out.println("Rock Crushes Scissors. Player one wins!");
                }
            }else if(playerOne.equalsIgnoreCase("P")){
                if(playerTwo.equalsIgnoreCase("R")){
                    System.out.println("Paper covers rock. Player one wins!");
                }else if(playerTwo.equalsIgnoreCase("P")){
                    System.out.println("Paper vs Paper. It's a tie!");
                }else{ // player two Scissors
                    System.out.println("Scissors cuts Paper. Player two wins!");
                }
            }else{ //Player one = Scissors
                if(playerTwo.equalsIgnoreCase("R")){
                    System.out.println("Rock crushes Scissors. Player two wins!");
                }else if(playerTwo.equalsIgnoreCase("P")){
                    System.out.println("Scissors cuts Paper. Player one wins!");
                }else{ // player two Scissors
                    System.out.println("Scissors vs Scissors. It's a tie!");
                }
            }

            do{
                System.out.println("Would you like to play again?(y/n): ");
                playAgain = sc.nextLine();
                if(!(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))){
                    System.out.println("Invalid input. Please try again.");
                }
            }while(!(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")));

        } while(playAgain.equalsIgnoreCase("y"));
    }
}