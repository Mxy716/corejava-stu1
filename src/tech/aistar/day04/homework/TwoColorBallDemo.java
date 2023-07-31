package tech.aistar.day04.homework;

import java.util.Arrays;

public class TwoColorBallDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random() * 6 + 1);
            arr[i] = n;

            for (int j = 0; j < i; j++) {
                if (arr[j] == n) {
                    i--;
                    break;
                }
            }


        }System.out.println(Arrays.toString(arr));
    }

}

