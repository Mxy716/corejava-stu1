package tech.aistar.day06;
/**
 * 本来用来演示: final修饰的变量 - 常量
 *
 *             final修饰的属性[全部变量] - 常量属性
 */
public class FinalDemo {
    //属性和方法 => 成员
    //公开的静态常量属性
    public static final int YEAR = 1;
    public  static void test(){
        //final修饰的变量
        final int i =10;//常量 - 不可改变的量
        //i=20;
    }

}
class FinalDemoTest{
    public static void main(String[] args) {
        System.out.println(FinalDemo.YEAR);
    }
}