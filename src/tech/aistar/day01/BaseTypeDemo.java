package tech.aistar.day01;

public class BaseTypeDemo {
    public static void main(String[] args) {
        //理解一下int a = 10;

        //java中是采用数据类型和变量来定义和存储数据的
        //int - 基本数据类型, a - 变量, 10 - 常量/字面量

        //本质:
        // ①当程序运行到此行的时候,会在jvm的栈区开辟一个int类型大小的区域(大小由前面的数据类型决定)
        // ② = 代表的赋值的意思,将字面量整数10放入到/存储到这个区域中.
        // ③ 每个区域都会有一个内存地址,但是这个内存地址对使用者不太友好.因此为了方便使用,会给每个区域
        //    进行命名 - 命的名称 - 变量名 - 对用户是可见的

        //变量仍然可以理解为内存中保存数据的"容器" - 保存单个值

        // 切记1 - 在同一个{}中,不能出现重复的变量名
        // 切记2 - 每个变量只能在属于自己的{}中使用 - 作用域的范围.
        int a = 10;
        //一班不会自己再去写{} - 代码块 - code block
        {
            //代码块
            int b = 20;

        }
        {
            int b = 20;
            System.out.println(b);
        }
        //System.out.println(b);//error

        //用户如何访问/使用

        //本质 - 底层将变量名a映射到具体的区域的地址的.
        System.out.println(a);
        System.out.println("======华丽丽的分割线======");
        //此处不展示细节
        //TODO...
        byte b = 10;
        short s = 20;
        int m = 10;

        //TODO...
        long x = 100;

        float f = 3.14f;

        double d = 5.35d;

        //只能存储单个字符,使用单引号
        char c = '中';

        boolean flag = false;
    }
}
