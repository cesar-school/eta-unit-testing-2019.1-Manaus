package school.cesar.eta.unit;

public class MyApplication {

    private MessageService service = new MessageService();

    public void setService(MessageService service) {
        this.service = service;
    }

    public boolean processMessage(String msg, String rec) {
        //some magic like validation, logging etc
        return service.sendMessage(msg, rec);
    }
}