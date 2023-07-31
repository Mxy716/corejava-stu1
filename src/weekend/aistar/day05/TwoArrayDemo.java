package weekend.aistar.day05;

import java.util.Arrays;

//二维数组的定义和使用
public class TwoArrayDemo {
    public static void main(String[] args) {
        //1.二维数组的赋值
        int[][]arr1=new int[3][2];
        System.out.println(arr1.length);//3

        //通过下表一一赋值
        arr1[0][0]=100;
        //arr1[0][3] = 200;//ArrayIndexOutOfBoundsException

        //通过下标一一赋值=>如果没有手动赋值,系统仍然会分配默认值
        System.out.println(Arrays.toString(arr1[1]));

        System.out.println("===");
        //定义数组的同时进行赋值
        //        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};//ok
        int[][] arr2 = {{1,2,3},{4,5,6}};//ok
    }
}
