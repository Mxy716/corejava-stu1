package weekend.aistar.day10.abstracts;

public abstract class SupAbstract {
    //1.可以有普通属性,普通方法
    private String sign;
    public String getSign(){
        return sign;
    }
    //允许构造的


    public SupAbstract() {
    }

    public SupAbstract(String sign) {
        this.sign = sign;
    }

    //抽象方法
    public abstract double area();
    public abstract double girth();


}
