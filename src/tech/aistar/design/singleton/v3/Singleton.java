package tech.aistar.design.singleton.v3;

public class Singleton {
    private static Singleton instance =null;
    private Singleton(){
        System.out.println("构造快");
    }

    public static  synchronized Singleton getInstance(){
        return instance==null?instance = new Singleton():instance;
    }
}

class  SingletonTest{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread t =new Thread(()->{
                Singleton s = Singleton.getInstance();
            });

            t.start();
        }

    }
}