package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void fivePlusTwoShouldBeSeven() {
        var addition = new Calculator();
        assertEquals(7, addition.add(5, 2));
    }



}
