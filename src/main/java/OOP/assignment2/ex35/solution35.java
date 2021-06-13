/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex35;
import java.util.*;

public class solution35 {
    public static void main(String[] args) {
        List<String> contestants = new LinkedList<String>();
        contestants = addContestants(contestants);
        String winner = pickWinner(contestants);
        System.out.printf("%nThe winner is...%s",winner);
        }

    private static String pickWinner(List<String> contestants) {
        int size = contestants.size(); int pick;
        Random rand = new Random();
        pick = rand.nextInt(size);
        return contestants.get(pick);
    }

    private static List<String> addContestants(List<String> contestants) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("%nEnter a name:");
            name = scanner.nextLine();
            contestants.add(name);
        }while(!name.equals(""));
        return contestants;
    }
}

