package tech.aistar.day07;

import java.util.Arrays;

//测试
public class StudentTest {
    public static void main(String[] args) {


        //1.调用非静态的成员 - 对象去调用
        //创建一个student对象

        //背后
        //1.①通过new关键字在jvm的堆区开辟一个新空间
        //2.②然后进行对象的初始化(比如会给属性进行默认赋值)
        //3.③将对象在堆空间中的内存地址赋值给了一个引用变量s1,并且保存在栈区

        //所以s1本质是一个引用.
        //TODO...jvm底层惊醒了指令重排,进行了优化,优化后的步骤①->③->②
        Student s1 = new Student();
        System.out.println(s1);//tech.aistar.day07.Student@3b07d329

        //由于没有进行封装
        //所有的非私有的成员,此处允许直接使用对象进行直接的操作
        //所有的非私有的成员,此处允许直接使用对象进行直接的操作
        System.out.println(s1.age);//分配了默认值

        //外界赋值
        //对象.成员
        s1.age=18;
        System.out.println(s1.age);
        System.out.println(Arrays.toString(s1.hobbies));
    }
}