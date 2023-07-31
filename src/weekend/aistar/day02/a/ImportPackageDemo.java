package weekend.aistar.day02.a;
//导包的意义 - 让jvm精确的知道使用的是哪个类!!!
import weekend.aistar.day02.method.MethodHelloDemo;


public class ImportPackageDemo {
    public static void main(String[] args) {
        //test02();
        MethodHelloDemo.test02();

        //调用b包下的MethodHelloDemo中的test02方法
        //场景:在同一个类中同时使用到了不同包下的同名类中的方法

        tech.aistar.day02.b.MethodHelloDemo.test02();

    }
}
