package tech.aistar.day03.homework;

public class TestDemo03 {
    public static void main(String[] args) {
        //用for循环实现斐波那契数
        //1 1 2 3 5 8 13 21 34 55 ..

            int a = 1, b = 1;
            for (int i = 1; i <= 10; i++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }

