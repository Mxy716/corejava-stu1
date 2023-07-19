package tech.aistar.day03;

public class RecursionDemo {
    public static void main(String[] args) {
        //1.斐波那契数测验
        System.out.println(fei(3));
        System.out.println("=====================");
        //2.求阶乘检验
        System.out.println(jie(5));
        System.out.println("=====================");
        //3.求最大公约数检验
        System.out.println(yue(20,12));
        System.out.println("=====================");
        //4.杨辉三角检验
        System.out.println(yang(4,3));
        System.out.println("=====================");
        //5.给定数字,依次输出这个数字每一位上的数字
        getSum(321);


    }


    //求斐波那契数列 1 1 2 3 5 8 13 21 34 55....
    public static int fei(int n){
        if (n==1||n==2)
            return 1;
        return fei(n-2)+fei(n-1);
    }

    //求阶乘
    public static int jie(int n){
      if (n==1)
          return 1;
      return n*jie(n-1);
    }

    //求最大公约数
    public static int yue(int a,int b){//12 |_20___
        if (a%b==0)                      //     8
            return b;
        return yue(b,a%b);
    }

    //求杨辉三角坐标的数值
/*  1
    11
    121
    1331
    14641
*/
    public static int yang(int x,int y){
        if (x==y||y==1)
            return 1;
        return yang(x-1,y)+yang(x-1,y-1);
    }

    //给定一个数字,一次按照顺序输出这个数字
    public static void getSum(int n) {

        if ( n>9)
            getSum(n/10);
        System.out.println(n%10);


    }
}
