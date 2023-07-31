package weekend.aistar.day01;
/**
 * 演示HelloWorld
 *
 * ctrl + n 查看 jdk中的内置类 - 学习源码
  */

//HelloWorld本质是类型的简称而已.
//类的全称 - 类的全限定名应当是 包名.类名
//weekend.aistar.day01.HelloWorld
public class HelloWorld {
/**
 *  main方法 - 程序的主入口,一旦启动程序,自动进入到main方法中去执行.
 *   args 虚拟机参数
 */
    public static void main(String[] args) {


        System.out.println("HelloWorld");
    }
}
//面试官 - 一个类文件中允许存在多个类吗?
//允许,but不能是public修饰的 - 不能是公共的/公开的类

class Hello{
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}