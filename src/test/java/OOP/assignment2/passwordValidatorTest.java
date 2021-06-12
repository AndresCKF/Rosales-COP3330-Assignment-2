/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex25.solution25;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class passwordValidatorTest {
    solution25 solution25 = new solution25();
    @Test
    void countCharacters_work_allCharacters(){
        OOP.assignment2.ex25.solution25.passwordMakeup passwordCount = solution25.countCharacters("Password");
        assertEquals(passwordCount.letters, 8);
        assertEquals(passwordCount.special, 0);
        assertEquals(passwordCount.numbers, 0);
    }
    @Test
    void countCharacters_work_allSpecials(){
        OOP.assignment2.ex25.solution25.passwordMakeup passwordCount = solution25.countCharacters("!! $$ %%");
        assertEquals(passwordCount.letters, 0);
        assertEquals(passwordCount.special, 8);
        assertEquals(passwordCount.numbers, 0);
    }
    @Test
    void countCharacters_work_allNumbers(){
        OOP.assignment2.ex25.solution25.passwordMakeup passwordCount = solution25.countCharacters("1234567890");
        assertEquals(passwordCount.letters, 0);
        assertEquals(passwordCount.special, 0);
        assertEquals(passwordCount.numbers, 10);
    }
    @Test
    @DisplayName("1234567890")
    void passwordValidator_onlargeNumbers(){
        int strength = solution25.passwordValidator("1234567890");
        assertEquals(strength, 3);
    }
    @Test
    @DisplayName("!@#$%^&*()")
    void passwordValidator_onlargeSpecial(){
        int strength = solution25.passwordValidator("!@#$%^&*()");
        assertEquals(strength, 3);
    }
}
