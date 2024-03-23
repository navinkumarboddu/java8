package datatypes.coding.packageStudy.engine;

import java.util.Scanner;

public class GuessMyNumber {

    private int numberOfTries;
    private int numberOfTriesPlayed = 0;
    private int numberToGuess = 0;

    public GuessMyNumber(int numberOfTries){
        if(numberOfTries < 1 || numberOfTries > 10){
            throw new IllegalArgumentException("Unfair number of tries selected ! \n" +
                    "Choose a value between 1 and 10");
        }

        this.numberOfTries = numberOfTries;

        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        setNumberToGuess(randomNumber.getNumberToGuess());
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getNumberOfTriesPlayed() {
        return numberOfTriesPlayed;
    }

    public void setNumberOfTriesPlayed(int numberOfTriesPlayed) {
        this.numberOfTriesPlayed = numberOfTriesPlayed;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean guessedCorrectly = false;

        while (numberOfTriesPlayed < numberOfTries) {
            System.out.println("Enter a number between 1 and 10:");
            guess = scanner.nextInt();
            numberOfTriesPlayed++;

            if (guess == numberToGuess) {
                guessedCorrectly = true;
                break;
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + numberOfTriesPlayed + " tries.");
        } else {
            System.out.println("Sorry, you've exhausted all your tries. The number was: " + numberToGuess);
        }
    }

}
