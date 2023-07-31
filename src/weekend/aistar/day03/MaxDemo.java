package weekend.aistar.day03;

public class MaxDemo {
    public static void main(String[] args) {
        //1.max和min
        int max = Math.max(10, 30);
        System.out.println(max);
        System.out.println(Math.min(10, 30));
        //2. abs -求绝对值
        System.out.println(Math.abs(-10));

        //3.求次方
        int result = (int) Math.pow(2, 3);//2^3
        System.out.println(result);//8

        //4.开根
        double m = Math.sqrt(9);
        System.out.println(m);//3.0

        //5.笔试试卷中最喜欢提到的floor
        //返回小于或等于参数的最大(最接近正无穷大)double值,
        //static double floor(double d)
        double f1 =Math.floor(3.5);
        System.out.println(f1);//3.0
        System.out.println(Math.floor(4.0));//4.0
        System.out.println(Math.floor(-3.5));//-4.0


        //static long round(double a)
        //返回参数中最接近的long,其中long四舍五入为正无穷大
        System.out.println(Math.round(3.5));//4

        //round的底层还是floor=>公式round(a)=floor(a+1/2)
        System.out.println(Math.round(-3.5));//-3

        //求随机数(没有绝对随机的,都是伪随机) - 非常重要的.
        //static double random();//[0.0,1.0)
        double r = Math.random();
        System.out.println(r);
        //求出[1,100]之间的随机整数
        int n = (int) (Math.random()*100+1);//[1.0,101.0)
        System.out.println("n:"+n);

        //利用它可以求出任意俩个数之间的随机整数
        //[7,9]
        int t = (int) (Math.random()*3 + 7);
        System.out.println("t:"+t);

        System.out.println(Math.PI);



    }
}