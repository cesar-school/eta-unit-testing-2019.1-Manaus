package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PalindromeMockitoTest {

    @Spy
    private Palindrome palindrome;

    @Test
    public void check_singleCharString_true(){
        Assertions.assertTrue(palindrome.check("a"));
        verify(palindrome, times(1)).check(anyString());
    }

    @Test
    public void check_sameStartAndEndChar_true(){
        Assertions.assertTrue(palindrome.check("ana"));
        verify(palindrome, times(2)).check(anyString());
    }

    @Test
    public void check_differentStartAndEndChar_false(){
        Assertions.assertFalse(palindrome.check("ab"));
        verify(palindrome, times(1)).check(anyString());
    }

}
