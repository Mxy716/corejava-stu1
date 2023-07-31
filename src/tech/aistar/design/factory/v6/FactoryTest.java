package tech.aistar.design.factory.v6;

import tech.aistar.design.factory.v1.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new PhoneHuaWeiFactory();
        Sender sender = factory.createSender();
        sender.send();
        Call call = factory.createCall();
        call.call();
    }
}
