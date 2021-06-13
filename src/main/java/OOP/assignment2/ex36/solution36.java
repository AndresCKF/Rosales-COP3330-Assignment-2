/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
//average, max, min, and std

package OOP.assignment2.ex36;
import java.util.*;

public class solution36 {
    public static void main(String[] args) {
        List <Integer> data = generateData();
        double averageData = average(data);
        int maxData = max(data);
        int minData = min(data);
        double stdData = std(data);
        System.out.printf("The average is: %f %nThe Max is %d %n" +
                "The Min is %d %nThe standard deviation is %f",
                averageData,maxData,minData,stdData);
    }

    public static double std(List<Integer> data) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = data.size();
        double mean = average(data);
        for(double num: data) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }

    private static int min(List<Integer> data) {
        data = sortData(data);
        return data.get(0);
    }

    public static int max(List<Integer> data) {
        data = sortData(data);
        return data.get(data.size()-1);
    }

    private static List<Integer> sortData(List<Integer> data) {
        int temp;
        for(int i = 0; i < data.size()-1;i++){
            if(data.get(i) > data.get(i+1)){
                temp = data.get(i+1);
                data.set(i+1,data.get(i));
                data.set(i,temp);
            }
        }
        return data;
    }

    public static double average(List<Integer> data) {
        float sum = 0;
        for(int i=0; i< data.size();i++){
            sum += data.get(i);
        }
        return sum/data.size();
    }

    private static List<Integer> generateData() {
        Scanner scanner = new Scanner(System.in);
        String input; boolean condition,doneFlag=false;
        List <Integer> data = new LinkedList<Integer>();
        do{
            do {
                System.out.println("Enter a number:");
                input = scanner.nextLine();
                condition = scrubInput(input);
            }while(!condition);

            if(input.equals("done")){
                break;
            }
            data.add(Integer.parseInt(input));
        }while(condition);
        return data;
    }

    public static boolean scrubInput(String input) {
        if (input == null) {
            return false;
        }
        if (input.equals("done")){
            return true;
        }else {
            try {
                int d = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.printf("Not a number %n");
                return false;
            }
        }
        return true;
    }
}
