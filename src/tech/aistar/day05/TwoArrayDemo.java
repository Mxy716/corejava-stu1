package tech.aistar.day05;

import java.util.Arrays;

public class TwoArrayDemo {
    public static void main(String[] args) {
        //1.二维数组的赋值
        int [][] arr1=new int[3] [2];
        System.out.println(arr1.length  );
        //通过下标一一赋值
        arr1[0][0]=100;
       // arr1[0][3]=200;//ArrayIndexOutOfBoundsException
        //通过下标一一赋值=>如果没有手动赋值,系统仍然会分配默认值
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println("=====");
       //定义数组的同时进行赋值
//        int [][]arr2=new int[][]{{1,2,3},{4,5,6}};  //ok
        int [][]arr2={{1,2,3},{4,5,6}};



        //可以通过双层for循环进行输出
        for (int[] outer : arr2) {
            for (int i : outer) {
                System.out.println(i+"\t");
            }
            System.out.println();
        }
        System.out.println("=======");


        //先定义二维数组,然后进行一行一行的赋值
        int[][]arr3=new int[2][3];
        arr3[0]=new int[]{1,2,3};
        //        arr3[0] = {1,2,3};//编译错误
        arr3[1]=new int[]{6,7,8};

        //双层普通for循环输出
        for (int i = 0; i < arr3.length; i++) {
            //int[] temp = arr3[i];
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("======");
        //定义不规则的二维数组
        int[][]arr4=new int[3][];
        arr4[0]=new int[]{1};
        arr4[0]=new int[]{1,2,3};
        arr4[0]=new int[]{1,2};
        int[][]arr5={{100},{100,200},{100,300   }};
        System.out.println(Arrays.deepToString(arr5));






    }

}
