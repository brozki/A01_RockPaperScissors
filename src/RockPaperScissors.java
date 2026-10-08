import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            String playerAMove;
            String playerBMove;

            // Keep asking until Player A enters R, P, or S
            do {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerAMove = input.nextLine().trim().toUpperCase();
            } while (!playerAMove.equals("R") && !playerAMove.equals("P") && !playerAMove.equals("S"));

            // Same for Player B
            do {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerBMove = input.nextLine().trim().toUpperCase();
            } while (!playerBMove.equals("R") && !playerBMove.equals("P") && !playerBMove.equals("S"));

            // Turn each letter into a word for display
            String playerAName = "Rock";
            if (playerAMove.equals("P")) {
                playerAName = "Paper";
            } else if (playerAMove.equals("S")) {
                playerAName = "Scissors";
            }

            String playerBName = "Rock";
            if (playerBMove.equals("P")) {
                playerBName = "Paper";
            } else if (playerBMove.equals("S")) {
                playerBName = "Scissors";
            }

            // Decide the result
            if (playerAMove.equals(playerBMove)) {
                System.out.println(playerAName + " vs " + playerBName + " it's a Tie!");
            } else if (playerAMove.equals("R") && playerBMove.equals("S")) {
                System.out.println("Rock breaks Scissors. Player A wins!");
            } else if (playerAMove.equals("P") && playerBMove.equals("R")) {
                System.out.println("Paper covers Rock. Player A wins!");
            } else if (playerAMove.equals("S") && playerBMove.equals("P")) {
                System.out.println("Scissors cuts Paper. Player A wins!");
            } else if (playerBMove.equals("R") && playerAMove.equals("S")) {
                System.out.println("Rock breaks Scissors. Player B wins!");
            } else if (playerBMove.equals("P") && playerAMove.equals("R")) {
                System.out.println("Paper covers Rock. Player B wins!");
            } else {
                System.out.println("Scissors cuts Paper. Player B wins!");
            }

            // Ask to replay, also validated
            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = input.nextLine().trim().toUpperCase();
            } while (!playAgain.equals("Y") && !playAgain.equals("N"));

        } while (playAgain.equals("Y"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}