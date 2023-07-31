package tech.aistar.design.factory.v2;

import tech.aistar.design.factory.v1.Sender;

public class TestSenderFactory {
    public static void main(String[] args) {

        //优势: 将对象的创建和对象使用进行了分离(解耦)
        Sender s = SenderFactory.getInstance(SenderFactory.SMS);
        s.send();
        Sender e = SenderFactory.getInstance(SenderFactory.EMAIL);
        e.send();



    }
}
