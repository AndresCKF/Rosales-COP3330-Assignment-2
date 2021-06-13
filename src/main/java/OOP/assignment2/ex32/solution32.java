/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
//guessing game - 3 difficulties, 10, 100, 1000
//comp tells player too high or low.
//counts number of guesses
//do you wish to play again? y/n
//dont allow non-numeric guesses
//count those as incorrect guesses.
package OOP.assignment2.ex32;
import java.util.Random;
import java.util.Scanner;

public class solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            runGame();
            System.out.print("Do you want to play again? Y/N");
            response = scanner.nextLine();
        }
        while(response.equals("y") || response.equals("Y"));
    }

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        int gameNum;boolean won;
        //Game state, 1st = player's Guess, 2nd = #Guesses 3rd = difficulty
        int[] playerState = new int[3];
        System.out.printf("Let's play guess the number: the game! %n%n");
        playerState[2] = getDifficulty();
        gameNum = generateRand(playerState[2]);
        System.out.printf("I have my number, what's your guess? %n");
        do {
            playerState = getGuess(playerState);
            won = compareNums(gameNum, playerState);
        }while (!won);
    }

    private static boolean compareNums(int gameNum, int[] playerState) {
        if(gameNum == playerState[0]){
            System.out.printf("You got it in %d guesses!", playerState[1]);
            return true;
        }else if (gameNum > playerState[0]){
            System.out.printf("Too low, guess again.%n");
            return false;
        }else{
            System.out.printf("Too high, guess again.%n");
            return false;
        }
    }

    private static int[] getGuess(int[] playerState) {
        Scanner scanner = new Scanner(System.in);
        int guess = playerState[0]; int numGuesses = playerState[1];
        int difficulty = playerState[2]; int range = (int)Math.pow(10, difficulty);
        do {
            try {
                System.out.printf("Enter a guess between 1 and %d:",range);
                numGuesses++;
                guess = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.printf("Not a number %n");
            }
        } while (guess > range);
        playerState[0] = guess;
        playerState[1] = numGuesses;
        return playerState;
    }

    public static int getDifficulty() {
        Scanner scanner = new Scanner(System.in);
        int difficulty;
        do{
            System.out.print("Choose a difficulty [1] [2] [3] ");
            difficulty = getNumber();
        }
        while ((difficulty > 3) || (difficulty == 0));
        return difficulty;

    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try{
            System.out.print("Please enter a number:");
            number = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e){
            System.out.print("Not a number %n");
        }
        return number;
    }

    public static int generateRand(int difficulty) {
        Random rand = new Random();
        int gameNum;
        if(difficulty == 1){
            gameNum = rand.nextInt(10) + 1;
        }
        else if(difficulty == 2){
            gameNum = rand.nextInt(100) + 1;
        }
        else{
            gameNum = rand.nextInt(1000) + 1;
        }
        return gameNum;
    }
}
