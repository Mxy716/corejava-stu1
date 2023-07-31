package tech.aistar.design.factory.v5;

import tech.aistar.design.factory.v1.EmailSender;
import tech.aistar.design.factory.v1.Sender;
public class EmailFactory implements Factory{

    @Override
    public Sender creatSender() {

        return new EmailSender();
    }
}
