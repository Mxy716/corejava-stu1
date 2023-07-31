package tech.aistar.day10.interfaces;

public interface IUserDao {
    //接口中的属性都是公开的静态的常量属性
    //public static final int DAY = 1;
    //简化
    //public int DAY = 1;
    //最简洁
    int DAY = 1;

    // jdk8.0之前的说法是 - java中的方法都是抽象方法 - 必须是public
    // public abstract void change();

    //简写
    //public void change();

    //精简
    void change();

    void find();

    //接口中不能提供构造

    //jdk8.0开始允许使用default关键字来定义普通方法

    //省略了public
    default void test(){
        System.out.println("test...");
    }

    //允许提供静态方法
    static void testStatic(){
        System.out.println("static...");
    }

    //私有方法 - jdk9.0 - 接口内部使用的
    private void testPri(){
        System.out.println("私有方法");
    }


}
