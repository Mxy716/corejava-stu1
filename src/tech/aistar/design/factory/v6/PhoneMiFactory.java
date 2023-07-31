package tech.aistar.design.factory.v6;

import tech.aistar.design.factory.v1.EmailSender;
import tech.aistar.design.factory.v1.Sender;

public class PhoneMiFactory implements Factory {
    @Override
    public Sender createSender() {
        return new EmailSender();
    }

    @Override
    public Call createCall() {
        return new WXCall();
    }
}
