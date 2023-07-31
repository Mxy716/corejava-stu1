package tech.aistar.day06;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a:>");
        int n = sc.nextInt();
        System.out.println("n:"+n);

        //如果非要nextInt调用完之后使用nextLine,为了避免真正的nextLine失效
        //可以多写一个nextLine来处理一下\n
        sc.nextLine();

        System.out.print("输入字符串:>");
        //其实它没有失效,只是接受完毕了,接受到了nextInt没有处理的\n
        String line = sc.nextLine();
        System.out.println("line:"+line);
    }
}
