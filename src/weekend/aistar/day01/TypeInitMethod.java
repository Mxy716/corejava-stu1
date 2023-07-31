package weekend.aistar.day01;

//类型初始化方法
public class TypeInitMethod {
    public static void main(String[] args) {
        int a = 10;
        //表达式进行赋值
        int result = a + 20;

        // + 连接的内容中只要出现字符串,表示拼接
        System.out.println("result:" + result);

        System.out.println(5 + 5 + "" + 5 + 5);//1055

        //链式赋值
        int x, y, z = 10;//仅仅对z赋值
        System.out.println(z);

        //可以在此处x使用之前,先对x进行初始化
        x = 20;
        System.out.println("x:" + x);

        //链式赋值,对多个变量进行统一赋值
        int t1, t2, t3;
        t1 = t2 = t3 = 90;

        //TODO... 未来学习的 允许使用方法进行赋值
        int m = Math.max(10, 5);//返回俩个数中比较大的值
        System.out.println(m);

        int n = getResult();//随便写一个方法名称,alter+enter
        System.out.println(n);

    }

    //TODO... 暂时不要了解
    private static int getResult() {
        return 100;
    }

}

