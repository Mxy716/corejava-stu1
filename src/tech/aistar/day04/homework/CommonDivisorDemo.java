package tech.aistar.day04.homework;

public class CommonDivisorDemo {
    public static void main(String[] args) {
        getCommonDivisor(20,12);
    }

    private static void getCommonDivisor(int a, int b) {
        while (a%b!=0) {
            int n =0;
            n=b;//n=12
            b=a%b;//b=8
            a=n;//a=12
        }
        System.out.println(b);
    }
}
