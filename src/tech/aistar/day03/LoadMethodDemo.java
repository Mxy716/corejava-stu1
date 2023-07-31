package tech.aistar.day03;

public class LoadMethodDemo {

    public void test01(){
        System.out.println("test01");

    }
    public void test01(int i ){
        System.out.println("test02-int..."+i);
    }
    public double test01(double a){
        return a;
    }
    class LoadMethodtest{
        public static void main(String[] args) {
            LoadMethodDemo m = new LoadMethodDemo();
            //到底掉用哪个重载的方法 - 关键取决于实参
            m.test01();

            System.out.println(m.test01(3.14));
            //简化api
        }
    }
}
