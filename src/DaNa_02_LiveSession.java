import java.util.Scanner;

public class DaNa_02_LiveSession {
    public static void main(String[] args)
    {
      /*  Number Guessing Game
            ● Generate a random number between 1 and 100 (💡 use Math.random()).
            ● Let the user guess the number.
            ● In each iteration, check if the guess is correct, higher, or lower.
            ● Provide hints (higher or lower) until the guess is correct.
      */


  /*
● Ask the user for re-play after each successful guess (e.g. “Would you like
        to play again? (Y/N):”).

        A new random number will be generated after each
        round. If the user no longer wants to continue, a goodbye message will be
        displayed.
   */   Scanner myScanner = new Scanner(System.in);

        String playAgain;
        int gameNumber = 0;
        int score= 101;

        do {
            gameNumber++;
            System.out.println("Number Guessing Game");
            int randomNumber;
            randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Random number is: " + randomNumber);

            System.out.println("Please guess the number: ");
            int user_input = myScanner.nextInt();
            int numberofTries = 1;

            while (user_input != randomNumber) {
                if (user_input < randomNumber) {
                    System.out.println("Your number is too low");
                } else
                    System.out.println("Your number is too High");

                numberofTries++;
                System.out.println("Please guess the number: ");
                user_input = myScanner.nextInt();
            }


            System.out.println("yey! YOU guess the number!");
            System.out.println("You guess it AFTER " + numberofTries + "tries");


            if (score > numberofTries)
                score = numberofTries;

            if (numberofTries <= 5)
                System.out.println("Amazing! You have a great intuition!");
            else if (numberofTries > 5 && numberofTries <= 10) {
                System.out.println("For 6-10 tries: Well done! You have good guessing skills!");
            } else if (numberofTries > 10 && numberofTries <= 15) {
                System.out.println("Well done! You have good guessing skills");
            } else if (numberofTries > 15 && numberofTries <= 20) {
                System.out.println("Nice effort! Keep practicing to improve!");
            } else
                System.out.println("Don't give up! You'll get better with more practice!");

            Scanner myScanner1 = new Scanner(System.in);
            System.out.println("Would you like to play again? (Y/N): ");
            playAgain = myScanner1.nextLine();
            System.out.println("You choose: " + playAgain);

        }while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("You choose: " + playAgain + ".Exit");
        System.out.println("Number of games = " + gameNumber);
        System.out.println("The best score is === " + score);
     /*
     Bonus:
● Keep track of the number of user’s tries and display it after the user
guesses the number. - ok

● Add personalized messages based on their performance (the number of
tries it takes for the user to guess the correct number).
Message examples:
For 1-5 tries: “Amazing! You have a great intuition!”
For 6-10 tries: “Well done! You have good guessing skills!”
For 11-15 tries: “Good job! Practice makes perfect!”
For 16-20 tries: “Nice effort! Keep practicing to improve!”
For more than 20 tries: “Don't give up! You'll get better with more
practice!”.


● Ask the user for re-play after each successful guess (e.g. “Would you like
to play again? (Y/N):”). A new random number will be generated after each
round. If the user no longer wants to continue, a goodbye message will be
displayed.


● Display a user’s best score before the game exits. The best score would be
considered the least number of tries it took to guess the number across
multiple games
      */
    }
}
