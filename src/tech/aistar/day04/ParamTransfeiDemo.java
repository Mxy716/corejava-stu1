package tech.aistar.day04;
import java.util.Arrays;
// 笔试题
public class ParamTransfeiDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        test(arr1,arr2);

        System.out.println("main-arr1:"+ Arrays.toString(arr1));//[1,2,3]
        System.out.println("main-arr2:"+ Arrays.toString(arr2));//[5,6,7]
    }

    private static void test(int[] arr1,int[] arr2) {
        //arr1和arr2指向的是同一个对象
        arr1 = arr2;

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 1;
        }

        System.out.println("test-arr1:"+ Arrays.toString(arr1));//[5,6,7]
        System.out.println("test-arr2:"+ Arrays.toString(arr2));//[5,6,7]
    }
    }

