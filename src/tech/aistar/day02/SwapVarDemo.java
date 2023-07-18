package tech.aistar.day02;

public class SwapVarDemo {
    public static void main(String[] args) {
        //搓方法
        int a = 10;
        int b = 20;
        //定义一个变量
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a);
        System.out.println("b" + b);
        //使用^的特点来进行交换
        //面试多加的要求:不允许使用第三方变量

        //结论:一个属连续异或同一个数两次,结果是他本省,未来- 简单的进行加密解密运算

        int i = 100;
        int j = 200;
        i = i ^ j;// i=100^200
        j = i ^ j;//j=100^200^200=100
        i = i ^ j;//i=100^200^100=200
        System.out.println("i:" + i);
        System.out.println("j:" + j);

        //老师独创
        int m = 1000;
        int n = 2000;
        m = n ^ (n = m) ^ m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);


    }
}
