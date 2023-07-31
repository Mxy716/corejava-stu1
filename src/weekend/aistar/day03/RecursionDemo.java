package weekend.aistar.day03;


//递归算法
public class RecursionDemo {
    public static void main(String[] args) {
//        System.out.println(fei(8));
////        System.out.println(jie(6));
////        System.out.println(divisor(18, 12));
////        System.out.println(multiple(20, 12));
////        System.out.println(YangHui(3, 2));
        sortNum(324);
    }




    /**
     * 斐波那契数列 1 1 2 3 5 8 13 21 34
     *
     * @param n 位置 - 第一个数对应的n=1
     * @return 对应n这个位置的数值
     */
    public static int fei(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        return fei(n - 1) + fei(n - 2);
    }

    /**
     *
     *
     * 求阶乘
     * 6! = 6*5*4*3*2*1 = 720
     * 5! = 5*4*.....*1 = 120
     * ..
     * .
     * 1!=1
     *
     */
    public static int jie(int n) {

        if (n == 1) {
            return 1;
        }
       return n*jie(n-1);
    }



    /**
     * 求出m和n的最大公约数
     * @param m
     * @param n
     *
     */
    private static int divisor(int m, int n) {
        int x =m%n;
        if (x==0){
            return n;
        }
        return divisor(n,x);

    }


    /**
     * 最小公倍数  20,12 => 60
     *
     *  m*n/m和n最大公约数
     *  20*12/4 = 60
     * m
     * n
     *
     */
    public static int multiple(int m,int n){
        return m * n / divisor(m,n);
    }


    /**
     *  求杨辉三角
     * @param x 行,从1开始
     * @param y 列,从1开始
     * @return
     */
    public static int YangHui(int x,int y) {
        if (x==y||y==1)
            return 1;
        return YangHui(x-1,y)+YangHui(x-1,y-1);
    }




    /**
     * 给定n,依次按照顺序输出这个数字每位上的数字
     * @param n
     */
    public static void sortNum(int n) {
        if(n>9)
            //①sortNum(324/10)

            //②sortNum(32/10)

            //n = 3,if语句不走了
            sortNum(n/10);

        //①还没有来得及走 324%10

        //②还没有来得及走 32%10
        System.out.print(n%10+" ");

        //第一个结果就是3 2 4
    }

}