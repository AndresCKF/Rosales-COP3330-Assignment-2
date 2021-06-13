/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex31.solution31;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;
public class solution31Test {

    @Test
    void does_formatValid_Catch_letters(){
        String[] testUser = {"a","60"};
        boolean result = solution31.formatValid(testUser);
        assert(result);
    }
    @Test
    void does_formatValid_allow_numbers(){
        String[] testUser = {"0","60"};
        boolean result = solution31.formatValid(testUser);
        assert(!result);
    }
    @Test
    void check_intensityCalculator_correct() {
        int[] testUser = {22, 65};
        int[] result = solution31.intensityCalculator(testUser);
        int[] answer = {138, 145, 151, 158, 165, 171, 178, 185, 191};
        assertArrayEquals(answer, result);
    }
}
