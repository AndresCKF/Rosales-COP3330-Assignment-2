/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex27;
import OOP.assignment2.ex27.getEmployeeData;
import java.util.Scanner;

public class solution27 {
    public static void main(String[] args) {
        //prevent incorrect formats
        Person newEmployee = new Person();
        boolean cond = true;
        while(cond) {
            newEmployee = getEmployeeData.getInput();
            if(getEmployeeData.checkFormat(newEmployee)){
                cond = false;
            }
        }
        System.out.printf("Y");
    }

}
