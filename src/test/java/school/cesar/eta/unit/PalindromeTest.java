package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    private Palindrome palindrome;
    private int count;

    @BeforeEach
    public void testSetup(){
        count = 0;
        palindrome = palindrome = new Palindrome(){
            @Override
            public boolean check(String word) {
                count++;
                return super.check(word);
            }
        };
    }

    @Test
    public void check_singleCharString_true(){
        Assertions.assertTrue(palindrome.check("a"));
        Assertions.assertEquals(1, count);
    }

    @Test
    public void check_sameStartAndEndChar_true(){
        Assertions.assertTrue(palindrome.check("ana"));
        Assertions.assertEquals(2, count);
    }

    @Test
    public void check_differentStartAndEndChar_false(){
        Assertions.assertFalse(palindrome.check("ab"));
        Assertions.assertEquals(1, count);
    }
}
