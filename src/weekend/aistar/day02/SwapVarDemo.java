package weekend.aistar.day02;
//交换俩个变量的值
public class SwapVarDemo {
    public static void main(String[] args) {
        //搓方法
        int a = 10;
        int b = 20;
        //定义一个变量
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

        //使用^的特点来进行交换
        //面试多加的要求:不允许使用第三方变量

//      结论: 一个数连续异或同一个数俩次,结果是它本身.   未来 - 简单的加密和解密的操作.
        int i = 100;
        int j = 200;

        i = i ^ j;//i = 100 ^ 200
        j = i ^ j;//j = 100 ^ 200 ^ 200 = 100
        i = i ^ j;//i = 100 ^ 200 ^ 100 = 200

        System.out.println("i:"+i);
        System.out.println("j:"+j);

        //success版本 - 独创...
        int m =1000;
        int n =2000;
        m=n^(n=m)^n;
        //m = 2000^1000^1000
        System.out.println(m);

    }
}
