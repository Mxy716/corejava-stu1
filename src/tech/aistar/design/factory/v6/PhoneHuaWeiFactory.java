package tech.aistar.design.factory.v6;

import tech.aistar.design.factory.v1.SMSSender;
import tech.aistar.design.factory.v1.Sender;

public class PhoneHuaWeiFactory implements Factory {
    @Override
    public Sender createSender() {
        return new SMSSender();
    }

    @Override
    public Call createCall() {
        return  new QQCall() ;

    }
}
