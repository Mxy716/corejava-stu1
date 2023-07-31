package tech.aistar.design.factory.v5;

import tech.aistar.design.factory.v1.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new EmailFactory();
        Sender s = factory.creatSender();
        s.send();
    }
}
