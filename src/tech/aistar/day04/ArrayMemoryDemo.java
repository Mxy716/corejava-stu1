package tech.aistar.day04;

import java.util.Arrays;

public class ArrayMemoryDemo {
    public static void main(String[] args) {
        //①通过new关键字,会在堆中开辟一个区域,申请空间
        //②然后给这个对象进行初始化
        //③将这个对象在堆空间中的内存地址赋值给了一个引用变量arr1,然后存储在栈区
        int[] arr1 = {1,2,3};
        System.out.println(arr1);//[I@7ad041f3

        int[] arr2 = {1,2,3};
        System.out.println(arr2);//[I@251a69d7
        //==在java中永远永远比较的值
        System.out.println(arr1 == arr2);//false

        System.out.println(Arrays.equals(arr1,arr2));//true

        //TODO... char类型数组比较特殊一点
        char[] crr = {'a','b','c'};
        System.out.println(crr);//abc
        System.out.println(""+crr);//[C@251a69d7

        System.out.println("====引用和对象之间的关系 - 提前学习 - 种子====");

        //创建了一个数组对象arr3 => 认为arr3是对象的名称   => 这句话是不对的
        //因为arr3仅仅是这个数组对象的引用而已.
        int[] arr3 = {1,2,3};

        //引用和对象之间是一个什么关系呢?
        //引用里面保存的就是对象在堆空间中的内存地址.
        //引用和对象之间的映射关系 - 符合"气球🎈理论"
        //1. 一个引用在某个时刻只能指向一个对象

        //2. 一个对象在某个时刻可以被多个引用指向.
        int[] arr4 = arr3;

        System.out.println("=======垃圾对象 - 没有任何引用指向的对象=========");

        int[] arr5 = {1,2,3};
        //arr5重新赋值了 - null,代表arr5已经不再指向原来的对象{1,2,3}
        //{1,2,3}这对象已经没有任何引用指向了 -> 垃圾对象 => 等待GC回收
        //int[] arr6 = arr5;
        arr5 = null;

        //System.out.println(Arrays.toString(arr6));
    }
}
