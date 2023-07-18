package tech.aistar.day02;

public class SignDemo {
    public static void main(String[] args) {
        int n = 2023;
        System.out.println("千位:" + n / 1000);
        System.out.println("百位:" + n / 100 % 10);
        System.out.println("十位:" + n / 10 % 10);
        System.out.println("个位:" + n % 10);


/****************************************/
        int y = 1;
        //通过表达式进行赋值
        //结论: 前++,
        //①y会自增1
        //②y自增1之后的值赋值给了result
        int result = ++y;
        System.out.println("result:" + result);//2

        int t = 1;
        //结论: 后++,
        //①t会自增1
        //②t自增1之前的值赋值给了res
        int res = t++;
        System.out.println("res:" + res);//1
    /**********************************/
        int i = 1;
        int j = ++i + i--;//j=2+2=4
        int w = --j + i++ + j++;//w=3+1+3
        System.out.println("w:" + w);
        System.out.println("===============");

        System.out.println(w == 7);//返回boolean,true
        System.out.println(!(3 > 2));//false
        System.out.println(!true);//false
        boolean flag = true;
        System.out.println(w == 7 && flag && 3 > 2);//true

        //短路的意思是如果存在多个条件表达式
        //左边的结果已经能够决定整个结果的话,那么后面的表达式将不会执行 -提高程序执行的效率
        //短路的特性证明
        int p = 1;
        System.out.println(w < 7 && (++p) > 1);
        System.out.println("p:" + p);//1

        System.out.println(w == 7 || (++p) > 1);
        System.out.println("p:" + p);

        //按位与/非短路与
        //作用1:也是可以用来连接条件的,也是所有的条件表达式都是true
        //      才会返回true,但是所有的表达式都会执行 -一般不会推荐使用的
        System.out.println(w < 7 & (++p) > 1);//false
        System.out.println("p:" + p);//2

        System.out.println(10 & 8);//8
        //&应用-奇数和偶数的判断
        System.out.println(10 % 2 == 0);//true
        //二进制转换成十进制=>x*2^n +m*2^n+...0/1
        // 偶数的二进制的末尾肯定是0,奇数肯定是1
        //偶数的二进制特点????????0&1=0;
        //奇数的二进制特点????????1&1=1;

        System.out.println((11 & 1) == 0);
        System.out.println(10 | 8);//10
        //异或,相同为0,不同为1
        System.out.println(10 ^ 8);


    }
}
