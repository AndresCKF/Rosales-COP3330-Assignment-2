/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex27.Person;
import OOP.assignment2.ex27.solution27;
import OOP.assignment2.ex27.getEmployeeData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class getEmployeeDataTest {
    getEmployeeData employeeData = new getEmployeeData();

    @Test
    void checkemployeeID_istrue(){
        Person newEmployee = new Person("andres", "rosales", "px-1204",12345);
        boolean result = employeeData.checkFormat(newEmployee);
        assertTrue(result);
    }
    @Test
    void checkOutofBounds_employeeID_isfalse(){
        Person newEmployee = new Person("andres", "rosales", "ax-123m",12345);
        boolean result = employeeData.checkFormat(newEmployee);
        assertFalse(result);
    }
}
