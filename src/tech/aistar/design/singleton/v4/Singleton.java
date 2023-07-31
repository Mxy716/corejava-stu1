package tech.aistar.design.singleton.v4;

//懒汉模式
public class Singleton {

    //懒汉模式 - 加载Singleton的时候,并没有立即将类的实例赋值给instance
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("构造快...");
    }

    //懒汉 - 谁先调用getInstance,那么才会去对instance进行初始化/赋值

    public static Singleton getInstance() {

        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(()->{
                Singleton s = Singleton.getInstance();
            });
            t.start();
        }
    }
}