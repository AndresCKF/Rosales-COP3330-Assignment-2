/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex27;
import OOP.assignment2.ex27.solution27;
import java.util.Scanner;

public class getEmployeeData {

    public static Person getInput() {
        Scanner scanner = new Scanner(System.in);
        Person newEmployee = new Person();
        //populate employee
        System.out.print("Please enter first name:");
        newEmployee.firstN = scanner.nextLine();
        System.out.print("Please enter last name:");
        newEmployee.lastN = scanner.nextLine();
        System.out.print("Please enter Employee ID:");
        newEmployee.employeeID = scanner.nextLine();
        System.out.print("Please enter Zipcode:");
        newEmployee.zipcode = scanner.nextInt();
        return newEmployee;
    }

    public static boolean checkFormat(Person newEmployee){
            if(newEmployee.firstN.length() < 2) {
                System.out.println("Name must be at least 2 characters long. Please try again");
                return false;
            }
            if(newEmployee.lastN.length() < 2) {
                System.out.println("Name must be at least 2 characters long. Please try again");
                return false;
            }
            if(!(newEmployee.employeeID.matches("^[A-Za-z]{2}-\\d{4}$"))) {
                System.out.println("Format is AA-1234. Please try again");
                return false;
            }
            if(!(newEmployee.zipcode == (int)newEmployee.zipcode)){
                System.out.println("Zipcode must be a number");
                return false;
            }
            return true;

    }
}
