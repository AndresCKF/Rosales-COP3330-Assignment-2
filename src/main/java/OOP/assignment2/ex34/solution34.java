/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */

package OOP.assignment2.ex34;
import java.util.*;

public class solution34 {
    public static void main(String[] args) {
        //print out list of employees
        //prompt for employee name
        //remove that employee from list
        //print out list again
        List<String> employees = new LinkedList<String>(Arrays.asList("John Smith","Jackie Jackson",
                "Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        displayEmpList(employees);
        String employee2Remove = getName();
        List <String> revisedEmployees = removeEmployee(employee2Remove, employees);
        displayEmpList(revisedEmployees);
    }

    private static void displayEmpList(List<String> employees) {
        for(int i=0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }
    }

    public static List<String> removeEmployee(String toRemove, List<String> employees) {
        employees.remove(toRemove);
        return  employees;
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an employee name to remove.%n");
        String employee2Remove = scanner.nextLine();
        return employee2Remove;
    }
}
