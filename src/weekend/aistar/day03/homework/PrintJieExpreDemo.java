package weekend.aistar.day03.homework;

/**
 * 本来用来演示:
 * 1!=1
 * 2!=2
 * 3!=6
 * 4!=24
 * 5!=120
 * 6!=720
 * <p>
 * 1! + 2! + 3! + 4! + 5! + 6!=873
 * <p>
 * 表达式?result1:result2
 */
public class PrintJieExpreDemo {
    public static void main(String[] args) {

        printDemo1(6);
    }

    private static void printDemo1(int n) {
        int num = 1;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            num = i * num;
            result += num;
            System.out.println(i + "!=" + num);
        }
        for (int i = 1; i <= 6; i++) {
            if (i == 6) {
                System.out.print(i + "!=" + result);
            } else {
                System.out.print(i + "!+");
            }
        }
    }

    //老师的方法
    private static void printDemo(int n) {
        //分析 - 编程从定义变量开始
        long total = 0L;//保存每个数字的阶乘的总和

        //定义一个字符串,来拼接最终的表达式
        String str = "";
        int sum = 1;
        //遍历
        for (int i = 1; i <= n; i++) {
            //定义变量 - 每个n的阶乘值.
            sum *= i;//sum = sum * i;
            System.out.println(i + "!=" + sum);
            total += sum;

            //字符串的拼接
            str += (i != n) ? (i + "!+") : (i + "!=");
        }
        System.out.println(str + total);

    }
}