/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
/*
* n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where
    n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment.
* */
package OOP.assignment2.ex26;
import java.util.*;
public class solution26 {
    public static void main(String[] args) {
        PaymentCalculator Calculator = new PaymentCalculator();
        //ask user for payment info
        //calculate number of months to repayment.
    double values[] = getInput();
    int months = Calculator.calculateMonthsUntilPaidOff(values);
    System.out.printf("It will take %d months to pay off this card.", months);
    }
    public static double[] getInput() {
        Scanner scanner = new Scanner(System.in);
        double inputValues[] = new double[3];
        System.out.print("Please enter your Balance:");
        inputValues[0]= scanner.nextInt();
        System.out.print("Please enter your Interest rate:");
        inputValues[1]= scanner.nextInt();
        System.out.print("Please enter your Monthly payment:");
        inputValues[2]= scanner.nextInt();
        return inputValues;
    }
}
