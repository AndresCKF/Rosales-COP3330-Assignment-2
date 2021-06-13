/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

package OOP.assignment2.ex31;
import java.util.Scanner;
public class solution31 {
    public static void main(String[] args) {
        //get user age and resting heartrate
        //test for integers
        //calculate target heart rate based on intensity percentage
        //pass age, restingheartrate, and arrayofbpms to print function.
        int[] user = new int[2];
        user = getUserInfo();
        int[] arrayBPM = intensityCalculator(user);
        displayTable(user, arrayBPM);
    }

    private static void displayTable(int[] user, int[] arrayBPM) {
        int intensity = 55;
        System.out.printf("Resting Pulse: %d        Age: %d%n%n",user[1],user[0]);
        System.out.printf("Intensity    | Rate%n");
        System.out.printf("-------------|--------%n");
        for(int i = 0;i<9;i++){
            System.out.printf("%d%%          | %d bpm%n",intensity,arrayBPM[i]);
            intensity += 5;
        }
    }

    public static int[] intensityCalculator(int[] user) {
        double age = user[0];
        double restingHR = user[1];
        int[] TargetHeartRate = new int[9];
        int intensity = 55;
        for (int i = 0; i < 9; i++) {
            TargetHeartRate[i] = (int) Math.round((((220 - age) - restingHR) * intensity/100) + restingHR);
            intensity += +5;
        }
        return TargetHeartRate;
    }

    private static int[] getUserInfo() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        String[] input = new String[2];

        while (check) {
            System.out.print("Please enter Age");
            input[0] = scanner.nextLine();
            System.out.print("Please enter Resting Heart Rate");
            input[1] = scanner.nextLine();
            check = formatValid(input);
        }
        return new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
    }

    public static boolean formatValid(String[] input) {
        try{
            int dummie = Integer.parseInt(input[0]);
        } catch (NumberFormatException e){
            System.out.print("Age must be a number");
            return true;
        }
        try{
            int dummie = Integer.parseInt(input[1]);
        } catch (NumberFormatException e){
            System.out.print("Heart Rate must be a number");
            return true;
        }
        return false;
    }
}
