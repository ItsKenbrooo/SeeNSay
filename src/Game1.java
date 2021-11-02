import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		 RockPaperScissors game = new RockPaperScissors();
	        game.runGame();

	    }

	}

	class RockPaperScissors {

	    private final String ANSI_RESET = "\u001B[0m";
	    private final String ANSI_RED = "\u001B[31m";
	    private final String ANSI_BLUE = "\u001B[34m";
	    private final String ANSI_YELLOW = "\u001B[33m";

	    private final int ROCK0 = 0;
	    private final int PAPER1 = 1;
	    private final int SCISSORS2 = 2;
	    private final int INVALID_RESPONSE = -1;

	    private final String ROCK = "" + '\u270A' + "  " + "rock" + "  " + '\u26F0';
	    private final String PAPER = "" + '\u270B' + "  " + "paper" + "  " + '\u2750';
	    private final String SCISSORS = "" + '\u270C' + "  " + "scissors" + "  " + '\u2700';
	    private final String invalidResponse = "That's not a choice. Try again";

	    private int playerScore;
	    private int computerScore;
	    private int tieScore;

	    private Scanner scanner;
	    private String playerChoice;
	    private int playerValue;

	    private Random randomGenerator = new Random();
	    private int computerValue;

	    public void runGame() {
	        System.out.println("Ready to play Rock - Paper - Scissors?");
	        setupPlayerChoice();
	        setupComputerChoice();
	        determineWinner(computerValue, playerValue);
	        System.out.println("");
	        System.out.println("Want to play best out of ten? Type yes or no");

	        if (playAgain()) { // yes
	            printCurrentScore();
	            nextRound();
	            bestOfTen();
	        } else { // no
	            scanner.close();
	        }
	    }
	
	 private int setupPlayerChoice() {
	        scanner = new Scanner(System.in);
	        System.out.println("What is your choice? Type rock, paper, or scissors.");
	        playerChoice = scanner.next();

	        if (playerChoice.equalsIgnoreCase("rock")) {
	            System.out.printf("Player chooses %s %n", ROCK);
	            playerValue = ROCK0;
	            return ROCK0;
	        } else if (playerChoice.equalsIgnoreCase("paper")) {
	            System.out.printf("Player chooses %s %n", PAPER);
	            playerValue = PAPER1;
	            return PAPER1;
	        } else if (playerChoice.equalsIgnoreCase("scissors")) {
	            System.out.printf("Player chooses %s %n", SCISSORS);
	            playerValue = SCISSORS2;
	            return SCISSORS2;
	        } else {
	            System.out.println(invalidResponse);
	            System.out.println("You must correctly spell out your choice:  rock, paper or scissors or YOU LOSE!");
	            playerValue = INVALID_RESPONSE;
	        }
	        return playerValue;
	    }	
	 private int setupComputerChoice() {
	        computerValue = randomGenerator.nextInt(3);

	        switch (computerValue) {
	        case 0:
	            System.out.printf("Computer chooses %s %n", ROCK);
	            break;
	        case 1:
	            System.out.printf("Computer chooses %s %n", PAPER);
	            break;
	        case 2:
	            System.out.printf("Computer chooses %s %n", SCISSORS);
	            break;
	        }
	        return computerValue;
	    }

	    private int determineWinner(int computerValue, int playerValue) {
	        System.out.print(ANSI_YELLOW);
	        System.out.printf("%n");
	        if (computerValue == playerValue) {
	            tieScore++;
	            System.out.println("It's a draw");
	            return tieScore;
	        } else if ((playerValue - 1 == computerValue) || (playerValue == ROCK0 && computerValue == SCISSORS2)) {
	        	 playerScore++;
	             System.out.println("Congratulations! You win!");
	             return playerScore;
	         } else {
	             computerScore++;
	             System.out.println("Computer wins this one!");
	             return computerScore;
	         }
	     }

	     private void printCurrentScore() {
	         System.out.print(ANSI_RED);
	         System.out.printf("%n");
	         System.out.printf("|%8s %1s |%10s %1s |%7s %2s | %n", "Player", "", "Computer", "", "Tie", "");
	         System.out.println("---------------------------------------");
	         System.out.printf("|%5d %4s |%6d %5s |%6d %3s | %n", playerScore, "", computerScore, "", tieScore, "");
	         System.out.println("");
	         System.out.print(ANSI_RESET);
	     }

	     private void bestOfTen() {
	         int numberOfRounds;
	         for (numberOfRounds = 2; numberOfRounds < 10; numberOfRounds++) {
	             nextRound();
	         }
	         printFinalResults();
	         
	         System.out.println("");
	         System.out.println("Want to play again? Type yes or no");

	         if (playAgain()) { // yes
	             clearScores();
	             runGame();
	         } else { // no
	             scanner.close();
	         }
	     }

	     private void printFinalResults() {
	         System.out.print(ANSI_BLUE);
	         System.out.printf("%n");
	         if (playerScore == computerScore) {
	             System.out.println("This match ended in a draw.  You are a worthy component.");
	         } else if (playerScore > computerScore) {
	             System.out.println("You are the champion!");
	         } else if (computerScore > playerScore) {
	             System.out.println("HA HA - You can't outdo a computer!");
	         }
	     }

	     private boolean playAgain() {

	         String response = scanner.next();
	         response.toLowerCase();

	         switch (response) {
	         case "yes":
	             return true;
	         case "no":
	             System.out.println("Thanks for playing! Come back soon");
	             scanner.close();
	             return false;
	         default:
	             System.out.println(invalidResponse);
	             System.out.println("Want to play best out of ten? Type yes or no");
	             String response2 = scanner.next();

	             if (response2.equalsIgnoreCase("yes")) {
	                 return true;
	             } else if (response2.equalsIgnoreCase("no")) {
	                 System.out.println("Thanks for playing! Come back soon");
	                 scanner.close();
	                 return false;
	             }
	         }
	         return false;
	     }

	     private void nextRound() {
	    	 setupPlayerChoice();
	         setupComputerChoice();
	         determineWinner(computerValue, playerValue);
	         printCurrentScore();
	     }

	     private void clearScores() {
	         playerScore = 0;
	         computerScore = 0;
	         tieScore = 0;
	         printCurrentScore();
	     }

	 
	        }

