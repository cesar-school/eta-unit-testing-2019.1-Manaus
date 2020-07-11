package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void isLeapYear_yearDivisibleBy400_true(){
        Assertions.assertTrue(LeapYear.isLeapYear(400));
    }

    @Test
    public void isLeapYear_yearDivisibleBy100_false(){
        Assertions.assertFalse(LeapYear.isLeapYear(100));
    }

    @Test
    public void isLeapYear_yearDivisibleBy4_true(){
     Assertions.assertTrue(LeapYear.isLeapYear(4));
    }

    @Test
    public void isLeapYear_yearNonDivisibleBy4_false(){
        Assertions.assertFalse(LeapYear.isLeapYear(3));
    }
}
