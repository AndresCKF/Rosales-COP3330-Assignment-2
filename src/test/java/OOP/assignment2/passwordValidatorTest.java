/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex25.solution25;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class passwordValidatorTest {
    @Test
    void countCharacters_work_allCharacters(){
        solution25 solution25 = new solution25();
        OOP.assignment2.ex25.solution25.passwordMakeup passwordCount = solution25.countCharacters("Password");
        assertEquals(passwordCount.letters, 8);
        assertEquals(passwordCount.special, 0);
        assertEquals(passwordCount.numbers, 0);
    }
    @Test
    void countCharacters_work_allSpecials(){
        solution25 solution25 = new solution25();
        OOP.assignment2.ex25.solution25.passwordMakeup passwordCount = solution25.countCharacters("!! $$ %%");
        assertEquals(passwordCount.letters, 0);
        assertEquals(passwordCount.special, 8);
        assertEquals(passwordCount.numbers, 0);
    }
    @Test
    void countCharacters_work_allNumbers(){
        solution25 solution25 = new solution25();
        OOP.assignment2.ex25.solution25.passwordMakeup passwordCount = solution25.countCharacters("1234567890");
        assertEquals(passwordCount.letters, 0);
        assertEquals(passwordCount.special, 0);
        assertEquals(passwordCount.numbers, 10);
    }
}
