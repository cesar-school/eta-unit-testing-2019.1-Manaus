package school.cesar.eta.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {

    private MyApplication application;

    @BeforeEach
    public void testSetup(){
        application = new MyApplication();
    }

    @AfterEach
    public void testTeardown(){
        application.setService(null);
    }

    @Test
    public void processMessage_returnsTrue() {
        MessageService service = new MessageServiceMocked();
        application.setService(service);
        Assertions.assertTrue(application.processMessage("", ""));
    }

    @Test
    public void processMessage_returnsFalseWithStub(){
        MessageService service = new MessageService(){
            @Override
            public boolean sendMessage(String msg, String rec){
                return false;
            }
        };
        application.setService(service);
        Assertions.assertFalse(application.processMessage(null, null));
    }

    @Test
    public void processMessage_returnsTrueWithStub(){
        MessageService service = new MessageService(){
            @Override
            public boolean sendMessage(String msg, String rec) {
                return true;
            }
        };
        application.setService(service);
        Assertions.assertTrue(application.processMessage("",null));
    }
}
