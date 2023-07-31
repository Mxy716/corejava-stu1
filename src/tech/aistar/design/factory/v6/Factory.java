package tech.aistar.design.factory.v6;
//抽象工厂 - 包含多个产品族
import tech.aistar.design.factory.v1.Sender;

public interface Factory {
    Sender createSender();

    Call createCall();

}
