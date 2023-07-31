package tech.aistar.day05;

import java.util.Arrays;

public class TwoArrayPoemDemo {
    public static void main(String[] args) {
        String[][] poems = {
                {"白","日","依","山","尽"},
                {"黄","河","入","海","流"},
                {"欲","穷","千","里","目"},
                {"更","上","一","层","楼"}
        };

        change(poems);
        vv(poems);
    }

    private static void vv(String[][] poems) {

    }

    private static void change(String[][] poems) {

        String[][]arr=new String[5][4];

        for (int i = 0; i < poems.length; i++) {
            for (int j = 0; j < poems[i].length; j++) {
                arr[j][i]=poems[i][j];
            }
        }
//遍历arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }


}
