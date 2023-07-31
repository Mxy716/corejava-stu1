package tech.aistar.design.singleton.v5;

public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println("构造快");
    }

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                Singleton s = Singleton.getInstance();
            });
            t.start();
        }

    }
}