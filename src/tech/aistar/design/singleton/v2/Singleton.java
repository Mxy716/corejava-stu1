package tech.aistar.design.singleton.v2;
//懒汉模式
public class Singleton {

    //懒汉模式 - 加载Singleton的时候,并没有立即将类的实例赋值给instance
    private  static Singleton instance = null;
    private Singleton(){
        System.out.println("构造快...");
    }

    //懒汉 - 水仙调用getInstance,那么才会去对instance进行初始化/赋值

    public static Singleton getInstance(){
        return instance==null?instance=new Singleton():instance;
    }
}
class  SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}