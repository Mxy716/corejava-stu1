package tech.aistar.design.factory.v2;


import tech.aistar.design.factory.v1.EmailSender;
import tech.aistar.design.factory.v1.SMSSender;
import tech.aistar.design.factory.v1.Sender;

@SuppressWarnings("all")
public class SenderFactory {
    //保证类型是安全的
    public static final String SMS = "SMS";
    public static final String EMAIL = "EMAIL";

    public static Sender getInstance(String type) {
        Sender sender = null;
        switch (type) {
            case SMS:
                sender = new SMSSender();
                break;
            case EMAIL:
                sender = new EmailSender();
                break;

        }
        return sender;

    }


}
