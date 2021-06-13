/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex29;
import java.util.Scanner;

public class solution29 {
    public static void main(String[] args) {
        double rate = getUserInput();
        double years = calculateReturn(rate);
        System.out.printf("It will take %f years to double your investment", years);
    }

    public static double calculateReturn(double rate) {
        return 72/rate;
    }

    public static double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        double input;
        while (true) {
            try {
                System.out.print("What is the rate of return?");
                input = Float.parseFloat(scanner.next());
                if(input == 0){
                    System.out.println("Must be a number greater than 0");
                    continue;
                }else{
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Must be a number greater than 0");
            }
        }
        return input;

    }
}
