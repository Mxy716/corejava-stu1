package tech.aistar.day04;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //1.数组的赋值
        //a.先定义一个数组,然后通过下表一一赋值,但是下标不能越界
        String[] arr1 =new String[3];
        //如果没有对数组中的元素进行赋值,那么系统就会根据元素类型来分配默认值

        System.out.println(arr1[0]  );
        //获取数组的长度,属性-length
        System.out.println(arr1.length);

        arr1[0]="java1";
        arr1[1]="java2";
        arr1[2]="java3";

        //编译是ok - 程序的运行期间,抛出java.langArrayIndexOutOfBoundsException数组下标越界异常
        //一旦此处发生了异常,那么异常行下的代码就不会执行了
        //arr1[3]="java4";
//        System.err.println("error..");
        //2.数组遍历方式
        //a.通过下标遍历
        System.out.println(arr1[0]);
        System.out.println("===========");

        //赋值方式
        //定义数组的同时进行一个赋值

        //int arr2[] = new int[]{10,'a','0'   };
        int arr2[] = {10,'a','0'};

        //通过普通for循环进行遍历
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
        System.out.println("===========");

        //赋值方式 - 通过普通for循环进行赋值
        int arr3[] = new int[3];
        for (int i =0;i<arr3.length;i++){
                arr3[i]=(int)(Math.random()*100+1);

        }
        //遍历增强for循环
        for (int a : arr3){
            System.out.println(a);
        }

        //数据工具类的遍历方式
        //java.util.Arrays[C]
        //static String toString(int[] arr);

        String result = Arrays.toString(arr3);
        System.out.println(result);



    }

}
