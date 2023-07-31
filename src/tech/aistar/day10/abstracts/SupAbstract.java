package tech.aistar.day10.abstracts;
//抽象的父类天生被继承
public abstract class SupAbstract {

    //可以有普通属性,普通方法
    private String sign;

    public String getSign(){
        return  sign;
    }

    //允许有构造的


    public SupAbstract() {
    }

    //抽象方法
    public abstract double area();
    public abstract double girth();
}
