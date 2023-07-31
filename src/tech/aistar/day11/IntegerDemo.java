package tech.aistar.day11;

public class IntegerDemo {
    public static void main(String[] args) {
        //1.int类型转化Integer
        Integer i =new Integer(10);
        System.out.println(i);

        //如果是非法字符串 - 抛出java.lang.NumberFormatException数字格式化
        Integer j = new Integer("10");
        System.out.println(j);

        //面试的时候-各种比较
        System.out.println(i==j);//false

        //Integer类型转换成int类型
        int n = i.intValue();
        System.out.println(n);

        //jdk5.0开始支持自动解封封箱
        //1.封箱 - 基本类型转换成包装类型
        Integer t1 =10;//本质Integer t1 = Integer.valueOf(10)
        //2.解箱 - 包装类型转换成基本类型
        int t2 = t1;

        //非常重要的方法 - 一切比较的基础的原理性的方法
        //结论:只要值在[-128,127]之间,使用==比较大结果就是true.
        //如果不在这个范围,它底层会new一个新的Integer
        Integer v1 = Integer.valueOf(-129);
        Integer v2 = Integer.valueOf(-129);
        System.out.println(v1==v2);

        //why? - 查看jvm指令
        Integer m1 = 128;//等同于Integer m1 = Integer.value(128);
        Integer m2 = 128;
        System.out.println(m1==m2);//true

        //why??? - 查看jvm指令
        int x = 10;
        //将包装类型和基本数据类型比较的时候,底层调用Integer对象的int intValue()方法
        //会将包装类型转换基本数据类型int,然后再进行值的一个比较.
        System.out.println(x==i );//true
    }
}
