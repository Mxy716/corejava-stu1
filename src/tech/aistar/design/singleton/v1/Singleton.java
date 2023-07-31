package tech.aistar.design.singleton.v1;
//饿汉模式
public class Singleton {
    //2.提供这个类的唯一(静态)实例
    //只会赋值一次

    //饿汉  - 加载Singleton类的时候,instance实例就会立即分配空间和初始化
    private static Singleton instance = new Singleton();




    //1.私有化构造
    private Singleton(){
        System.out.println("私有化");
    }

    //3.提供一个公开的静态方法来返回这个唯一实例
    public static Singleton getInstance(){
        return instance;
    }

}
class  SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s1);

    }
}