package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    public void check_singleCharString_true(){
        Assertions.assertTrue(Palindrome.check("a"));
    }

    @Test
    public void check_sameStartAndEndChar_true(){
        Assertions.assertTrue(Palindrome.check("ana"));
    }

    @Test
    public void check_differentStartAndEndChar_false(){
        Assertions.assertFalse(Palindrome.check("ab"));
    }
}
