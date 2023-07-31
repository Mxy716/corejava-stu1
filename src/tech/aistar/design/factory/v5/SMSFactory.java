package tech.aistar.design.factory.v5;

import tech.aistar.design.factory.v1.SMSSender;
import tech.aistar.design.factory.v1.Sender;

public class SMSFactory implements Factory {

    @Override
    public Sender creatSender() {
        return new SMSSender();
    }
}
