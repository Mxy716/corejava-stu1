package tech.aistar.day02.a;

//导包的意义 -让jvm精确的知道使用的是哪一个类!!!
import tech.aistar.day02.Method.MethodHelloDemo;

public class ImportPackageDemo {
    public static void main(String[] args) {

        MethodHelloDemo.test02();
        //调用b包下的MethodHelloDemo中的test02方法
        //场景:在同一类中同时使用到了不同包下的同名类中的方法
        tech.aistar.day02.Method.MethodHelloDemo.test02();
    }
}
