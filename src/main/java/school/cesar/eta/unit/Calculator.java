package school.cesar.eta.unit;

public class Calculator {
    public int factorial(int number) {
        if (number <= 1) {
            return number;
        }

        return number * factorial(number - 1);
    }
}
