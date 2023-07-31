package weekend.aistar.day03;

public class LoadMethodDemo {
    public void test01(){
        System.out.println("test01");
    }

    public void test01(int i){
        System.out.println("test02-int..."+i);
    }

    //    个数一样,类型不一样
    public double test01(double a){
        return a;
    }

}
//测试类
class LoadMethodTest{
    public static void main(String[] args) {
        LoadMethodDemo m = new LoadMethodDemo();

        //到底调用哪个重载的方法 - 关键去取决于实参
        m.test01();

        System.out.println(m.test01(3.14));

        //简化api

    }
}
