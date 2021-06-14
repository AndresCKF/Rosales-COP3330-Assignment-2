/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex38.solution38;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.sql.Array;
import static org.junit.jupiter.api.Assertions.*;
public class solution38Test {
    @Test
    void filteredFunction_TEST(){
        List<Integer> test = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 12));
        List<Integer> expect = new LinkedList<Integer>(Arrays.asList( 2, 4, 6, 12));

        test = solution38.filterEvenNumbers(test);
        Assert.assertEquals(expect, test);
    }
}
