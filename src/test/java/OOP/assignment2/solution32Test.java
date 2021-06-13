/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex32.solution32;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static org.junit.jupiter.api.Assertions.*;

public class solution32Test {
    solution32 app = new solution32();

    @Test
    void randomGen3_is_in_range(){
        int generated = app.generateRand(3);
        assert(generated < 1001 && generated >0);

    }
    @Test
    void randomGen2_is_in_range(){
        int generated = app.generateRand(2);
        assert(generated < 101 && generated >0);

    }
    @Test
    void randomGen1_is_in_range() {
        int generated = app.generateRand(1);
        assert (generated < 11 && generated > 0);
    }

}
