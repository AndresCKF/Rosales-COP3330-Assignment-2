package OOP.assignment2.ex27;

import java.util.Scanner;

public class getEmployeeData {
    public solution27.Person getInput() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        solution27.Person newEmployee = new solution27.Person();
        //prevent empty password.
        System.out.print("Please enter your first name:");
        while(condition){
            newEmployee.firstN = scanner.nextLine();
            if(newEmployee.firstN.length() < 2) {
                System.out.println("Name must be at least 2 characters long. Please try again");
            }
            else{
                condition = false;
            }
        }
        System.out.print("Please enter your last name:");
        condition = true;
        while(condition){
            newEmployee.lastN = scanner.nextLine();
            if(newEmployee.lastN.length() < 2) {
                System.out.println("Name must be at least 2 characters long. Please try again");
            }
            else{
                condition = false;
            }
        }
        condition = true;
        while(condition){
            newEmployee.employeeID = scanner.nextLine();
            if(newEmployee.employeeID.matches("^[A-Z]{2}-\\d{4}")) {
                System.out.println("Name must be at least 2 characters long. Please try again");
            }
            else{
                condition = false;
            }
        }
        return newEmployee;
    }
}
