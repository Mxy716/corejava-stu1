package tech.aistar.day02.Method;


/**
 * 总结  //1.非静态方法中'是'可以直接调用非静态方法的
 *        2.非静态方法中'不'可以直接调用静态方法的
 *        3.静态方法中'是'可以直接调用静态方法
 *        4.静态方法中'不'可以直接调用非静态方法
 */
public class MethodInvokeDemo {
    public static void main(String[] args) {

        MethodInvokeDemo m = new MethodInvokeDemo();
       // System.out.println(m);
        m.test01();
        System.out.println("====");
        test03();
    }

    //非静态的
    public void test01(){
        //通用的规则
//        MethodInvokeDemo m = new MethodInvokeDemo();
//        m.test02();

        //非静态方法中是可以直接调用非静态方法的

        //第一种理解方式 - 确定原则 - 非静态的一定是属于对象,一定要先创建对象
        //程序能够运行到此处的时候,该对象肯定已经存在了.
        //test02();

        //第二个理解的层面 - 语法层面 - 省略了this关键字
        //this - 当前对象 - 调用test01这个方法的对象
        //System.out.println(this);
        //this.test02();

        //非静态方法中是否可以直接调用静态方法的? - 允许
        //MethodInvokeDemo.test03();

        test03();


        System.out.println("test01 - non-static...");
    }

    public void test02(){

        System.out.println("test02 - non-static...");
    }

    //静态的
    public static void test03(){
        //静态方法中是可以直接调用静态方法
        test04();

        //静态方法中是否可以直接调用非静态方法
       // test01();

//        MethodInvokeDemo m = new MethodInvokeDemo();
//        m.test01();
        System.out.println("test03 - non-static...");
    }
    public static void test04(){
        System.out.println("test04 - non-static...");
    }
}
