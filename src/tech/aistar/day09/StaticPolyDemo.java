package tech.aistar.day09;

//静态方法不存在多态
public class StaticPolyDemo {
    public static void main(String[] args) {

        Sup sub = new Sub();
        //也是可以用使用对象去调用静态方法
        sub.test();
        //属性是没有重写的概念 - 拿到的就是父类中的实体变量 - 成员变量
        System.out.println(sub.a);
    }


}

class Sup{
    public int a = 10;

    public static void test() {
        System.out.println("Sup..");
    }
}

class Sub extends Sup{
    public int b =100;
    //但是static修饰的方法不允许重写 - 静态方法不允许重写

    public static void test(){
        System.out.println("Sub...");
    }
}