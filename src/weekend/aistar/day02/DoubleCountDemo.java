package weekend.aistar.day02;

import java.math.BigDecimal;

//小数计算
public class DoubleCountDemo {
    public static void main(String[] args) {
        System.out.println(0.1+0.1);//0.2

        //浮点数在进行计算的时候会有精度的丢失

        //原因:都是要先转换成二进制,然后才能够进行计算的.
        System.out.println(0.1+0.2);//0.30000000000000004

        //java中如何处理小数的计算
        //1. 如果数据比较简单
        System.out.println(((0.1*10)+(0.2*10))/10);

        //如果数据比long还要大,未来直接使用java.math.BigInteger

        //2.如果数据比较大,必须要使用未来学习到的java.math.BigDecimal内置类提供的方法
        //埋了种子
        BigDecimal m =new BigDecimal("0.1");
        BigDecimal n =new BigDecimal("0.2");
        System.out.println(m.add(n));


    }
}
