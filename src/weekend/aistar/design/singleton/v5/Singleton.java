package weekend.aistar.design.singleton.v5;

//懒汉模式
public class Singleton {

    private static volatile Singleton instance = null;

    public Singleton() {
        System.out.println("构造块");
    }

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread t1 = new Thread(() -> {
                Singleton s = new Singleton();
            });
            t1.start();
        }


    }
}