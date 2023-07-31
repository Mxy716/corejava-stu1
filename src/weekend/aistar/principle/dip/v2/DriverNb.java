package weekend.aistar.principle.dip.v2;
//依赖倒置...
//依赖于抽象而不依赖于具体
public class DriverNb {
    //多态 - 面向接口编程
    //方法的参数列表写成接口,调用方法是的实参可以写成实现类

    public void driver(Vehicle v){
        v.run();
    }
}
class TestDriverNb{
    public static void main(String[] args) {
        DriverNb driverNb = new DriverNb();
        Vehicle car = new Car();
        driverNb.driver(car);

        System.out.println("=========");
        Vehicle fireCar = new FireCar();
        driverNb.driver(fireCar);

    }
}