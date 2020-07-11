package school.cesar.eta.unit;

public class BodyMassIndex {
    public static String calculate(float bmi) {
        if (bmi < 17) {
            return "Severely underweight";
        }
        if (bmi < 18.5) {
            return "Underweight";
        }
        if (bmi < 25) {
            return "Healthy Weight";
        }
        if (bmi < 30) {
            return "Overweight";
        }
        return "Obese";
    }
}
