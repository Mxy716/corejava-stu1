package tech.aistar.day04;

public class WhileDemo {
    public static void main(String[] args) {
        //while实现打印数字1-5
        int i =1;

        while (i<=5){
            System.out.print(i);
            i++;
        }
        System.out.println();

        int n =1;
        //死循环
        while (true){
            System.out.println(n++);
            if (n==6) {
                break;
            }
        }
    }
}
