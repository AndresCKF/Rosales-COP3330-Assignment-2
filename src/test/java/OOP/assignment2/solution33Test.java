/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2;
import OOP.assignment2.ex33.solution33;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;
import java.sql.Array;
import static org.junit.jupiter.api.Assertions.*;

public class solution33Test {
    solution33 app = new solution33();
    @Test
    void answer_in_list(){
        List<String> possible = Arrays.asList( "Yes.", "No.", "Ask again later.", "Maybe.");
        String answer = app.generateAnswer();
        assert(possible.contains(answer));
    }
}
