package tech.aistar.until;

import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 6};

       // selectSort(arr);
        //bubbleSort(arr);
          sortDirectInsert(arr);
        //   quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    //选择排序
    private static void selectSort(int[] arr) {
        if (null == arr || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j] ^ arr[i];
                    arr[j] = arr[j] ^ arr[i];
                    arr[i] = arr[j] ^ arr[i];

                }

            }
        }

    }

    //冒泡排序
    private static void bubbleSort(int[] arr) {//记录冒几次泡
        if (null == arr || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) { //记录冒几次泡
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }

            }
        }

    }

    //直接插入排序
    private static void sortDirectInsert(int[] arr) {

        if (null == arr || arr.length == 0) {
            return;

        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                // A 2 k 8     4
                if (arr[j - 1] > arr[j]) {
                    arr[j - 1] = arr[j] ^ arr[j - 1];
                    arr[j] = arr[j] ^ arr[j - 1];
                    arr[j - 1] = arr[j] ^ arr[j - 1];
                }
            }

        }
    }
//快速排序

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            //1. 找到重合的位置
            //分区 - 挖坑填数
            int index = getIndex(arr, startIndex, endIndex);

            //2. 递归调用自己
            //index左边的
            quickSort(arr, startIndex, index - 1);

            //index右边的
            quickSort(arr, index + 1, endIndex);
        }
    }

    private static int getIndex(int[] arr, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        //1. 确定基准数
        int x = arr[i];

        while (i < j) {
            //由后向前找比它小的数,找到后挖出此数填到前一个坑中
            while (i < j && arr[j] >= x) {
                j--;
            }
            //如果arr[j]<x
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            //**由前向后找比它大或等于的数,找到后也挖出此数填到前一个坑中**
            while (i < j && arr[i] < x) {
                i++;
            }

            if (i < j) {
                //arr[i]开始大于等于x
                arr[j] = arr[i];
                j--;
            }
        }
        //说明i开始j重合
        arr[i] = x;//把基准数放入到重合的位置
        return i;
    }
}
