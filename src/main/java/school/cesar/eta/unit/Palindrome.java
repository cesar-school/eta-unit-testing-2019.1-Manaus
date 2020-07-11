package school.cesar.eta.unit;

/**
 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward.
 * such as madam, racecar. There are also numeric palindromes, including date/time stamps using short digits 11/11/11
 * 11:11 and long digits 02/02/2020.
 */
public class Palindrome {
    public static boolean check(String word) {
        int length = word.length();

        if (length <= 1) {
            return true;
        }

        if (word.charAt(0) == word.charAt(length - 1)) {
            return check(word.substring(1, length - 1));
        }

        return false;
    }
}
