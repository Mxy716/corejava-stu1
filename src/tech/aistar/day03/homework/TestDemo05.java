package tech.aistar.day03.homework;

public class TestDemo05 {
    public static void main(String[] args) {
        /**
         * 关于阶乘的题目
         *
         * 定义一个方法,传入一个参数,比如传入的是6.
         * 程序最终输出的结果,必须是下面的:
         * 1!=1
         * 2!=2
         * 3!=6
         * 4!=24
         * 5!=120
         * 6!=720
         *
         * 1! + 2! + 3! + 4! + 5! + 6!=873
         */

        printDemo(6);
    }

    private static void printDemo(int n) {

        //声明一个变量 -求和
        int num = 1;
        int z = 0;
        for (int i = 1; i<= n; i++) {
            num = num *i;
            z+=num;
            System.out.println(i+"!="+num);
        }
        for (int i = 1; i <=n ; i++) {


            if (i<n) {
                System.out.print(i + "!+");
            }else {
                System.out.println(i+"!="+z);
            }
        }

        //老师的方法
//        private static void printDemo(int n) {
//            //分析 - 编程从定义变量开始
//            long total = 0L;//保存每个数字的阶乘的总和
//
//            //定义一个字符串,来拼接最终的表达式
//            String str = "";
//            int sum = 1;
//            //遍历
//            for (int i = 1; i <=n; i++) {
//                //定义变量 - 每个n的阶乘值.
//                sum*=i;//sum = sum * i;
//                System.out.println(i+"!="+sum);
//                total+=sum;
//
//                //字符串的拼接
//                str+=(i!=n)?(i+"!+"):(i+"!=");
//            }
//            System.out.println(str+total);







    }
}
