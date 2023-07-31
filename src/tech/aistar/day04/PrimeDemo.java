package tech.aistar.day04;
//2-199之间的所有的素数,每7个换一行
public class PrimeDemo {
    public static void main(String[] args) {
        printPrime();
    }

    private static void printPrime() {
        //定义一个计数器
        int count = 0;


        boolean flag = true;

        for (int n  = 2; n <=199; n++) {
            //判断n是否为质数,只要找出除了1和它本身以外,是否还能够被一个数整除.
            //每次遇到一个新的数字的时候
            //定义一个标记位


            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    //说明不是质数
                    flag=false;
                    //找到一个,不需要找
                    break;//跳出内部循环
                }
            }
            if (flag) {

                System.out.println(n+"\t");
                count++;
                if (count==7){
                    System.out.println();
                    count=0;
                }
            }
            
        }
        

    }
}