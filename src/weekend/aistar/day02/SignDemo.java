package weekend.aistar.day02;

public class SignDemo {
    public static void main(String[] args) {
        System.out.println(9/2);//4
        System.out.println(9.0/2);//4.5
        System.out.println(10%3);//1

        int n =2023;
        //TODO.../和%
        System.out.println("千位:"+n/1000);
        System.out.println("百位:"+n/100%10);
        System.out.println("十位:"+n/10%10);
        System.out.println("个位:"+n%10);

        //前++
        //++符号在变量的左边
        int x= 1;
        //++x; // x=x+1;

        //后++
        x++;//x=x+1

        //结论:无论前++还是后++,变量自己都会自增1
        System.out.println("x:"+x);

        //应用2
        int y =1;
        //通过表达式进行赋值
        //结论:前++,
        //①y会自增1
        //②y会自增1之后的值赋值给了result
        int result=++y;
        System.out.println("result:"+result);//2

        int t = 1;
        //结论: 前++,
        //①t会自增1
        //②t自增1之前的值赋值给了res
        int res = t++;
        System.out.println("res:"+res);//1

        //面试
        int i = 1;
        // j = 2 + 2 = 4,     i = 1
        int j = ++i+i--;
        // w = 3 + 1 + 3 = 7
        int w = --j+i++ + j++;
        System.out.println("w:"+w);

        System.out.println(w == 7);//返回boolean,true
        System.out.println(!(3>2));//false
        System.out.println(!true);//false

        boolean flag = true;

        System.out.println(w==7 && flag && 3>2);//true

        // 短路的意思就是如果存在多个条件表达式,
        // 左边的结果已经能够决定整个结果的话,那么后面的表达式将不会执行 - 提高程序执行的效率
        // 短路的特性证明
        int p = 1;
        System.out.println(w<7 && (++p)>1);
        System.out.println("p:"+p);//1

        System.out.println(w==7 || (++p)>1);
        System.out.println("p:"+p);

        //按位与/非短路与
        //作用1: 也是可以用来连接条件的.也是所有的条件表达式都是true,
        //      才会返回true.但是所有的表达式都会执行 - 一般不会推荐使用的.
        System.out.println(w<7 & (++p)>1);//false
        System.out.println("p:"+p);//2
        System.out.println(10&8);//8   用二进制做与运算
//        1010
//        1000
//        1000 与运算都为1是1
        System.out.println((11 & 1) == 0);
        System.out.println(10 | 8); // 10
        //异或,相同为0,不同为1
        System.out.println(10 ^ 8);
//        1010
//        1000
//        0010  异或不同为1
    }
}
