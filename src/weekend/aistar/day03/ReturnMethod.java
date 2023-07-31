package weekend.aistar.day03;

/**
 * 本来用来演示: 带有返回值
 * <p>
 * 纠结: 有返回类型和无返回类型的选择???
 * 1. 打印三角 - 仅仅是为了输出 - 无返回类型即可
 * <p>
 * 2. 判断某年某月是否为闰年 - 有返回类型的 - boolean
 * 假设整个方法叫做isLeapYear() - 返回的值可能在程序中被n次调用.
 * 如果一个方法的执行结果在后续的过程中还有可能被使用.
 */
public class ReturnMethod {
    public static void main(String[] args) {
        //test01();

        //如果一个方法带有返回类型,那么在调用方法的时候
        //1. 可以直接输出方法的执行结果
        //System.out.println(test03());

        //2. 使用一个变量来存储这个方法的执行结果,然后再进行后续的处理
        // 变量的类型推荐和方法的返回类型一致,当然同样支持自动/强转

        //变量的赋值方式 - 通过方法进行赋值.
        int result = test03();
        //double result = test03();
        System.out.println("result:" + result);

        System.out.println(new ReturnMethod().test04());
    }

    //void 中存在return语句,那么这个return的作用是什么?
    //注意:程序中尽量不要随意去定义static静态方法-一般工具类中是推荐定义成静态方法的.
    public static void test01() {
        int a = 10;
        if (a < 20) {
            System.out.println("return...");
            return;//用来结束整个方法的
            //System.out.println("return语句下面不能出现代码");
        }
        System.out.println("end");
    }

    /**
     * return  + 返回值
     * 作用:1. 返回方法的执行结果;2.结束整个方法的.
     *
     * @return
     */
    public static double test02() {

        //1. 返回值要和方法的返回类型一致
        //return 3.14d;

        //2. 支持自动类型转换
        // int->double
        int a = 10;
        int b = 20;
        int result = a + b;
        return result;
    }

    public static int test03() {
        //3. 支持强制类型转换
        return (int) 3.64d;
    }

    //返回类型也可以是对象类型,其中常用的java.lang.String
    public String test04() {
        //定义一个字符串

        //String是使用的双引号.
        //底层 - 字符串的底层就是char类型的数组.
        String name = "admin";

        return name;
    }

    //定义一个私有的方法 - 只能在本类中调用,对外是不可见的
    private void ttt() {
        System.out.println("private...");
    }
}
