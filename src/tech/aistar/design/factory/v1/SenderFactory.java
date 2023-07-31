package tech.aistar.design.factory.v1;

public class SenderFactory  {

    //实现步骤 - 更具传入的参数,来返回某个接口/类的具体的实例
    //背后的理论: 方法的返回类型写成接口,方法的返回结果写成实现类
    public Sender getInstance(String type){
        //定义一个接口
        Sender sender =null;
        switch (type){
            case "SMS":
                sender = new SMSSender() ;
                break;
            case "EMAIL":
                sender=new EmailSender();
                break;


        }
        return sender;
    }

}
