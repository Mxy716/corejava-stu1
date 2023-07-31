package tech.aistar.day09;

//jvm加载类进内存的活动过程
public class JvmLoadClassDemo {
    //静态属性
    private static int guid = 100;

    //非静态属性
    private int id = 10;

    //静态代码块
    static {

        System.out.println("允许访问guid:" + guid);
        System.out.println("我是静态代码块,指挥执行一次!加载类之后就会立即执行");

    }

    //但是普通代码块的执行时机高于代码块.
    //普通代码快 - 每次new对象的时候,都会执行普通代码块
    //程序代码块中很少写普通代码块 - 迁移到构造快中.
    {
        System.out.println("允许id:"+id);
        System.out.println("普通代码快");
    }

    //每次new对想法的时候,都会执行构造快

public JvmLoadClassDemo(){
    System.out.println("构造快!");
}

    public static void main(String[] args) {
        JvmLoadClassDemo c1 = new JvmLoadClassDemo();
        JvmLoadClassDemo c2 = new JvmLoadClassDemo();

    }

}
