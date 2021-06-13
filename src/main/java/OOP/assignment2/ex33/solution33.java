/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex33;
import java.util.Random;
import java.util.Scanner;

public class solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //generate list of possible answers
        //prompt user to ask question
        //generate number between 0 and 3
        //output answer from array
        System.out.printf("Welcome to the magic 8 ball! What is your question?%n");
        scanner.nextLine();
        String answer = generateAnswer();
        System.out.printf(answer);
    }

    public static String generateAnswer() {
        String answer; int randInt;
        Random rand = new Random();
        String[] answers = {"Yes.", "No.", "Ask again later.", "Maybe."};

        randInt = rand.nextInt(4);
        answer = answers[randInt];
        return answer;
    }
}
