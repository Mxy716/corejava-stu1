package tech.aistar.design.factory.v2;

import tech.aistar.design.factory.v1.Sender;

public class SMSSender implements Sender {

    @Override
    public void send() {
        System.out.println("短信通知...");
    }
}
