package tech.aistar.day04;

import java.util.Arrays;

public class ArrayAddressDemo {
    public static void main(String[] args) {
        int a =10;//a基本数据类型的变量,保存的就是字面量10

        //基本类型传参-把变量的值拷贝一份给形参("副本")-"值传递"
        //    yy成文件的拷贝
        add(a);
        System.out.println("main-a:"+a);//10

        //对象类型传参 - 变量的地址拷贝一份给形参["副本"] -"引用传递/地址传递"
        //     yy成磁盘的窗口
        int arr[]={1,2,3};
        change(arr);

        System.out.println("main-arr"+Arrays.toString(arr));

    }

    private static void change(int[] arr) {
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        System.out.println("change-arr"+ Arrays.toString(arr));
    }

    private static void add(int a) {
        //形参也是在栈区
        a=100;
        System.out.println("add-a:"+a);//100
    }
}
