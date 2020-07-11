package school.cesar.eta.unit;

public class Calendar {
    /**
     * Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100,
     * but these centurial years are leap years, if they are exactly divisible by 400.
     * <p>
     * For example, the years 1700, 1800, and 1900 were not leap years, but the years 1600 and 2000 were.
     */
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
}
