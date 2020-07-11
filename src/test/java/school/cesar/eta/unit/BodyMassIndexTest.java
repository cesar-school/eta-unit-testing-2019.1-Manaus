package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void calculate_bmiUnder17_severelyUnderweight(){
        Assertions.assertEquals("Severely underweight", BodyMassIndex.calculate(16.9f));
    }

    @Test
    public void calculate_bmiUnder18Dot5_underweight(){
        Assertions.assertEquals("Underweight", BodyMassIndex.calculate(18.4f));
    }

    @Test
    public void calculate_bmiUnder25_underweight(){
        Assertions.assertEquals("Healthy Weight", BodyMassIndex.calculate(24.9f));
    }

    @Test
    public void calculate_bmiUnder30_underweight(){
        Assertions.assertEquals("Overweight", BodyMassIndex.calculate(29.9f));
    }

    @Test
    public void calculate_bmi30_underweight(){
        Assertions.assertEquals("Obese", BodyMassIndex.calculate(30));
    }

}
