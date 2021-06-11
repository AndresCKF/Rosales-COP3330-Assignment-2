/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;

import OOP.assignment2.ex24.base.AnagramDetector;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest{

    @Test
     void isAnagram_returns_true_for_anagrams()
    {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when boolean
        boolean actual = detector.isAnagram("note", "tone");
        boolean expected = true;

        //then
        assertEquals(expected, actual);
    }
    @Test
    void isAnagram_returns_false_for_anagrams()
    {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when boolean
        boolean actual = detector.isAnagram("wordwordwordwordwordword", "tone");
        boolean expected = false;

        //then
        assertEquals(expected, actual);
    }
}
