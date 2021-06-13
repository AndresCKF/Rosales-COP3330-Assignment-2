/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex34.solution34;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class solution34Test {
    @Test
    void is_employee_being_removed(){
        List <String> employees = new LinkedList<String>(Arrays.asList("John Smith","Jackie Jackson",
                "Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        List <String> revisedEmployees = new LinkedList<String>(Arrays.asList("John Smith","Jackie Jackson",
                "Amanda Cullen","Jeremy Goodwin"));
        List <String> functionAnswer = solution34.removeEmployee("Chris Jones", employees);
        Assert.assertEquals(revisedEmployees, functionAnswer);
    }
}
