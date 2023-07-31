package tech.aistar.day06;

public abstract class Sup {
    public static Sup getInstance(){
        //Sup sup = null;
        //sup = new Sub;
        Sup sup = new Sub();
        return  sup;
    }

}


//定义一个子类
class Sub extends Sup{//Sub - 相当于GregorianCalendar


}
class  TestSub{
    public static void main(String[] args) {
        //Sup sup = new Sup();//抽象类不能被实例化
        Sup sup = Sup.getInstance();
    }
}