/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex28;
import java.util.Scanner;
public class solution28 {
    public static void main(String[] args) {
        int sum;
        int[] fiveNums = getFive();
        sum = findSum(fiveNums);
        System.out.printf("The sum is %d",sum);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum +=  arr[i];
        return sum;
    }

    private static int[] getFive() {
        Scanner scanner = new Scanner(System.in);
        int[] fiveNums = new int [5];
        for(int i=0; i < fiveNums.length; i++){
            System.out.print("Please enter a number:");
            fiveNums[i] = scanner.nextInt();
        }
        return fiveNums;
    }
}
