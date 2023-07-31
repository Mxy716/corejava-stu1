package tech.aistar.day04.homework;
//反转
public class ReverseDemo {
    public static void main(String[] args) {

         getReverse(12345);
    }

    private static void getReverse(int n) {


        int i = 0;

        while (n != 0) {
            int m = n % 10;
            i = (i * 10) + m;
            n = n / 10;
        }

        System.out.println(i);



    }
}
