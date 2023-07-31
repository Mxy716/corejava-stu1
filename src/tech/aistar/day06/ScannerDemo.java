package tech.aistar.day06;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //InputStream in = System.in;
        //1. 导包
        //2. 创建对象
        //Scanner sc = new Scanner(in);
        Scanner sc = new Scanner(System.in);

        //参照物 - jvm内存
        //输入=>   外界=>内存
        //输出=> jvm内存写出去
        int n = sc.nextInt();
        System.out.println("n:"+n);

        double d = sc.nextDouble();
        System.out.println("d:"+d);

        //在调用nextLine调用之前千万不要调用nextInt或者nextDouble,否则会导致nextLine失效.
        String name = sc.nextLine();
        System.out.println("name:"+name);
    }

}
