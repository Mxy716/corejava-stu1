package tech.aistar.day09;
//静态属性分配空间个初始化的机会只有一次,并且是类一旦加载完毕,就会立即分配

public class StaticIdDemo {

    //普通属性 - 只要每次创建对象,就会对废井裕泰属性分配空间和初始化
    private  int id =10;
    //静态属性 - 一旦类加载之后,立即对静态属性分配空间和初始化,并且时机只有一次
    //静态属性在内存中永远只有一份 - 和创建了多少个对象是无关的
    //静态属性是对象共享的
    private  static int guid =100;

    public  StaticIdDemo(){
        this.id = ++guid;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        StaticIdDemo s1 = new StaticIdDemo();
        System.out.println(s1.getId());
        StaticIdDemo s2 = new StaticIdDemo();
        System.out.println(s2.getId());
        StaticIdDemo s3 = new StaticIdDemo();
        System.out.println(s3.getId());
    }
}
