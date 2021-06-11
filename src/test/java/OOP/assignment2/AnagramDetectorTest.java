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
}
