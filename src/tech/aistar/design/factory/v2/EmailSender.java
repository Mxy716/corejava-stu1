package tech.aistar.design.factory.v2;

import tech.aistar.design.factory.v1.Sender;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("邮箱通知..");
    }
}
