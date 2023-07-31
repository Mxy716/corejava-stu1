package tech.aistar.day03.homework;

public class TestDemo01 {
    public static void main(String[] args) {
        //方法一:
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= 10; j++) {
//                if (Math.abs(5-i)+Math.abs(5-j)==5){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // 打印上半部分菱形
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 1; j <= 7 - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 打印下半部分菱形
        for (int i = 7 - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= 7 - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("<<<<<<<<<>>>>>>>>");









        }

    }
