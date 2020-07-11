package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyApplicationMockitoTest {
    @InjectMocks
    private MyApplication application;
    @Mock
    private MessageService service;

    @Test
    public void processMessage_returnsFalse(){
        when(service.sendMessage(null,null)).thenReturn(false);
        Assertions.assertFalse(application.processMessage(null, null));
    }

    @Test
    public void processMessage_returnsTrue(){
        when(service.sendMessage("",null)).thenReturn(true);
        Assertions.assertTrue(application.processMessage("",null));
    }
}
