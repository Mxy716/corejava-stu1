package tech.aistar.day06;

/**
 * 本来用来演示: 静态属性 - 静态域 - api - Field
 */
public class StaticFieldDemo {
    //全局变量
    public  static int YEAR=1;

    public static void main(String[] args) {

    }
    public static  void  dd(){
        int i =10;//局部变量 - 作用域在该方法内部

        //允许访问YEAR
        System.out.println(YEAR);

    }
}
