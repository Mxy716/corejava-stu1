package tech.aistar.design.factory.v4;
import tech.aistar.design.factory.v1.EmailSender;
import tech.aistar.design.factory.v1.SMSSender;
import tech.aistar.design.factory.v1.Sender;
public class SenderFactory {



        public static Sender createSMS(){
            return new SMSSender();
        }

        public static Sender createEmail(){
            return new EmailSender();
        }
}
