package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void fivePlusTwoShouldBeSeven() {
        var addition = new Calculator();
        assertEquals(7, addition.add(5, 2));
    }

    @Test
    public void tenMinusFiveShouldBeFive() {
        var cal = new Calculator();
        assertEquals(5, cal.subtract(10, 5));
    }



}
