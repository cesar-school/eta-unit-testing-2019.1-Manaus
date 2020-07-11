package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {

    @Test
    public void processMessage_returnsTrue() {
        MessageService service = new MessageServiceMocked();
        MyApplication application = new MyApplication();
        application.setService(service);
        Assertions.assertTrue(application.processMessage("", ""));
    }
}
