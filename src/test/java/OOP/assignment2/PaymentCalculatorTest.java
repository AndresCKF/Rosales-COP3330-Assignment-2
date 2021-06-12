/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
*/
package OOP.assignment2;
import OOP.assignment2.ex26.PaymentCalculator;
import OOP.assignment2.ex26.solution26;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PaymentCalculatorTest {
    @Test
    void calculateMonths_Example(){
        PaymentCalculator PaymentCalculator = new PaymentCalculator();
        double[] anArray = {5000,12,100};
        int months = PaymentCalculator.calculateMonthsUntilPaidOff(anArray);
        assertEquals(70, months);
    }
}
