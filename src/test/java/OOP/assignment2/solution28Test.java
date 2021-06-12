/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex28.solution28;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class solution28Test {
    solution28 solution = new solution28();

    @Test
    void checkNormalSum() {
        int[] array = new int[]{1,1,1,1,0};
        int sum = solution.findSum(array);
        assertEquals(4,sum);
    }
    @Test
    void checkMAXSum() {
        int[] array = new int[]{1,1,1,1,Integer.MAX_VALUE};
        int sum = solution.findSum(array);
        assertEquals(-2147483645,sum);
    }
}
