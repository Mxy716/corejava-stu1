package tech.aistar.design.factory.v1;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("邮箱通知..");
    }
}
