package tech.aistar.day04.homework;
/**
        * 本来用来演示:
        * 给定一个参数,比如5
        *
        * 输出5+55+555+5555+55555=?
        *
        * 给定一个参数,比如3
        * 输出3 + 33 + 333 = ?
        */
public class TestDemo {
    public static void main(String[] args) {
        test(3);
    }

    private static void test(int n) {
        int temp =0;
        String str= "";
        int sum =0;
        for (int i = 0; i < n; i++) {
            temp=(temp*10)+n;
            str+=(i!=(n-1))?(temp+"+"):(temp+"=");
            sum+=temp;
        }
        System.out.println(str+sum);


    }
}
