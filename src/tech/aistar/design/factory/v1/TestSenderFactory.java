package tech.aistar.design.factory.v1;

public class TestSenderFactory {
    public static void main(String[] args) {
        SenderFactory factory =new SenderFactory();
        Sender s = factory.getInstance("SMS");
        s.send();
        Sender e = factory.getInstance("EMAIL");
        e.send();




    }
}
