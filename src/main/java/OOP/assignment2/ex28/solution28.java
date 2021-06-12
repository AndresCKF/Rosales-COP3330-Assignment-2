/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex28;
import java.util.Scanner;
public class solution28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum;
        sum = findSum();
        //ask user for 5 inputs
        //sum inputs
        //print
        System.out.printf("The sum is %d",sum);
    }

    private static int findSum() {
        int fiveNums[] = getFive();

    }

    private static int[] getFive() {
        int fiveNums[] = new int [5];
        for(int i=0;i<fiveNums.length();i++){
            System.out.print("Please enter a number:");

        }
    }
}
