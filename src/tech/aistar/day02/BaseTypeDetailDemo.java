package tech.aistar.day02;


public class BaseTypeDetailDemo {
    public static void main(String[] args) {
        short s = 100;

        //short=>byte
        //强制类型转换
        //较小的数据类型   变量 = (较小的数据类型)大的数据类型变量/字面量
        byte b = (byte) s;  //alter+enter

        //定义一个float类型
        float f = (float) 3.14;

        //double->float => 隐式转换
        float f2 = 3.14F;

        long now = 123456;//ok   int->long

        //思考:还需要在int类型后面加上l/L,达到int到long的隐式转换
        //定义long类型 - 推荐使用隐式
        long date = 456L;

        //jdk7.x,为了提高数据的可读性
        long o = 1_234_567_89L;
        System.out.println(o);

        //补充: 补充int类型
        int m = 10;//十进制

        //定义二进制的数据  , 以0b开始
        //1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^1
        int bn = 0b1010;
        System.out.println(bn);

        //定义八进制 , 以0开头的
        int oca = 032;
        System.out.println(oca);//26

        //定义十六进制  数字0-9或者字母A-F/a-f,A代表数字10,F代表数字15
        //以0x开头
//        int hex = 0xaf56;
        int hex = 0x00b0;//11*16^1 + 0
        System.out.println(hex);

        //定义一个double类型
        double d = 10.0d;
        System.out.println(d);

        System.out.println("====华丽丽的分割线====");
        int i= 1;
        i+=1;//i = i + 1;
        System.out.println(i);

        //面试题
        short s1 = 1;
        s1 = (short) (s1 + 1);//short + int=>int   强转成 short

        short s2 = 1;
        s2 += 1;//jvm底层进行转换,相当于s2 = (short) (s2 + 1);
        System.out.println(s2);

        //TODO... 为什么是-128
        //慎用+= ++ --
        byte u = 127;
        u+=1;
        System.out.println(u);//-128
    }
}
