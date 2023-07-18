package tech.aistar.day02.Method;
/*      有static修饰的方法 - 静态方法
        没有static修饰的方法 - 非静态方法 - 普通方法

        静态方法和非静态方法调用的方式是不一样的
        通用的规则:
       *非静态方法 - ①创建方法所在类的对象,②通过对象进行调用.
                     非静态方法属于对象
       *静态方法 - 允许直接使用类名.静态方法调用的
                  静态方法属于类*/
public class MethodHelloDemo {
    //main方法是静态方法
    public static void main(String[] args) {
        //必须在main方法中去调用自己写的方法的.

        //通用的规则:
        //非静态方法的调用
        //调用哪个类里面的方法,就去创建哪个类的对象 - 然后利用对象.方法名()进行调用
        //创建类的对象语法 - 死死记住
        //类名 对象名 = new 类名();

        //why? 为甚要创建对象呢?
        //TODO... 能听懂就听懂
        //TODO ①非静态的方法是属于对象的 - 如何理解这句话呢???
        //TODO ...


        //TODO... 背后的本质  int a = 10; >>> 栈
        // 数据类型 变量名 = 初始值;

        //TODO... 非静态的方法分配空间以及初始化的时机!

        //TODO... 1. 通过new关键字在jvm的堆区申请一个空间,
        //        2. 并且进行初始化[比如方法]
        //        3. 然后将这个对象在堆空间中的内存地址赋值给了变量m,存储在栈区.
        MethodHelloDemo m1 = new MethodHelloDemo();
        m1.test01();

        //静态方法的调用- 直接使用类名.方法名直接调用即可.
        //TODO... 静态方法是属于类的

        //TODO... 静态的方法的分配空间以及初始化的时机是什么时候呢?
        //当JVM加载类文件进内存的时候,立即优先给所有的静态的方法分配空间以及初始化!
        //时机比较靠前的.
        MethodHelloDemo.test02();
    }

    //1. 定义一个公开的无返回类型的非静态的无参的方法
    public void test01(){
        //方法体
        System.out.println("test01..non-static.");
    }

    //2. 定义一个公开的无返回类型的静态的无参的方法
    public static void test02(){
        System.out.println("test02..static");
    }
}

