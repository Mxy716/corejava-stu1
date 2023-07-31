package tech.aistar.design.factory.v3;
import tech.aistar.design.factory.v1.EmailSender;
import tech.aistar.design.factory.v1.SMSSender;
import tech.aistar.design.factory.v1.Sender;
//一个方法负责创建具体的实例
public class SenderFactory {
    public Sender createSMS(){
        return new SMSSender();
    }

    public Sender createEmail(){
        return new EmailSender();
    }
}
