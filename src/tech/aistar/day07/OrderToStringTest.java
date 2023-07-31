package tech.aistar.day07;

import java.util.Date;

public class OrderToStringTest {
    public static void main(String[] args) {
        Order o1 = new Order(1, "1001", 100.0d, new Date());
        //tech.aistar.day07.Order@3b07d329

        //TODO... "种子"
        //为什么是内存地址
        //当输出一个对象的时候,实际上是默认输出的是这个对象的toString方法的执行结果

        //Java.lang.Object类是所有的根类,基类,超类,父类 - "爸爸"
        //Object类是属于Object的子类,子类是可以访问父类中所有的非私有的成员

        //如何当前类Order中没有提供toString方法,那么默认会认为调用java.lang.Object类中的toString方法
        //如果当前类一旦重写toString[自己实现],就会采取就近原则 - 调用自己重写之后的toString
        //System.out.println(o1.toString());

        System.out.println(o1);

        System.out.println(o1.getClass().getName()+"@"+Integer.toHexString(o1.hashCode()));

    }
}
