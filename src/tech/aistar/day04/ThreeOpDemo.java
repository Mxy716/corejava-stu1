package tech.aistar.day04;

public class ThreeOpDemo {
    public static void main(String[] args) {
        int m =10;
        //可读性太差了...
        int result = m>20?10:(m>8?100:200);
        System.out.println(result);//100

        //笔试题 -"坑"
        int n = 80;
        System.out.println(n>70?99:100.0);//99.0
    }

}
