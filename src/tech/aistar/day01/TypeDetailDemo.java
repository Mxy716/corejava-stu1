package tech.aistar.day01;


public class TypeDetailDemo {
    public static void main(String[] args) {
        //1.java中看到一个整数,默认是int类型
        // java中看到一个小数,默认是double类型

        byte b = 126;

        //b=>short类型 1是一个int类型
        //大的数据类型在进行计算的时候,计算结果是偏向类型大的一方,b+1的计算结果是int类型
        //byte bb = b+1;

        //问题的源头
        //byte b =127;//编译是ok

        int x =127;
        //编译不通过的编译时最最最重要的是jvm区别对待变量和字面量的
        //如何区别对待呢?

        //当程序运行到此处的时候,在jvm的"眼里",不关心x具体的值,只关心x的类型,得出的结论是x属于int类型
        //jvm很当然的认为这个x可以在int类型的最小值和最大值之间发生变化
        //就会认为x可能会超出byte类型的范围,存在"风险",为了避免在程序运行期间发生类型一处的这种风险
        //强制在编译期间就要去处理 - "强制类型转换"

        //byte by = x;//编译不通过,why???

        // 此处的127虽然是int类型,但是127是一个常量[不可变化的量]
        // jvm精确的判断出127是否在byte类型的范围内[-128,127]
        // 然后jvm在内部仍然会进行强制类型转换[窄化转换] - 大的数据类型转换成小的数据类型
        byte m = 127;//编译是ok的呢 - why???

        int n = m;//byte=>int类型
        System.out.println(n);

        // char->int,输出的是该字符对应的ASCII码,'a'=>97,'A'=>65,'0'=>48
        char c = 'a';
        int cc = c;
        System.out.println(cc);//97
        // TODO... char类型的计算都是转换成ASCII码进行计算的.
        int o = 'a' + '0';
        System.out.println("o:"+o);//145


        //int->double,不能自动转换成float
        int y = 123456789;
        float f = y;
        System.out.println("f:"+f);//1.23456792E8

        double d = y;
        System.out.println("d:"+d);//1.23456789E8
    }
}
