package tech.aistar.day05;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int []arr ={3,1,3};
        int[]temp= Arrays.copyOf(arr,arr.length+1);
        //适合在原数组的末尾添加数据
        temp[temp.length-1]=100;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));

    }
}
