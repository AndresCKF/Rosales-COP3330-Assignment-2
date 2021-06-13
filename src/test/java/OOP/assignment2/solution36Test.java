/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex36.solution36;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.sql.Array;
import static org.junit.jupiter.api.Assertions.*;

public class solution36Test {
    @Test
    void test_scrubInput_null(){
        boolean result = solution36.scrubInput("");
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    void test_scrubInput_double(){
        boolean result = solution36.scrubInput("26.6");
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    void test_scrubInput_Integer(){
        boolean result = solution36.scrubInput("200");
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    void test_scrubInput_Letter(){
        boolean result = solution36.scrubInput("far");
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    void test_average_function(){
        List <Integer> data = new LinkedList<Integer>(Arrays.asList(1,10));
        double result = solution36.average(data);
        assertEquals(5.5,result);
    }
    void test_average_functionZeros(){
        List <Integer> data = new LinkedList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,10));
        double result = solution36.average(data);
        assertEquals(1,result);
    }
    @Test
    void does_max_work(){
        List <Integer> data = new LinkedList<Integer>
                (Arrays.asList(10,0,0,0,0,0,0,0,0,1));
        int result = solution36.max(data);
        assertEquals(10,result);
    }
    @Test
    @DisplayName("STD 0,1")
    void check_stdFunction(){
        List <Integer> testdata = Arrays.asList(0,1);
        double stdResult = solution36.std(testdata);
        assertEquals(0.5,stdResult,0.001);
    }
    @Test
    @DisplayName("STD 1,1")
    void check_stdFunctionOnes(){
        List <Integer> testdata = Arrays.asList(1,1);
        double stdResult = solution36.std(testdata);
        assertEquals(0.0,stdResult,0.001);
    }
}
