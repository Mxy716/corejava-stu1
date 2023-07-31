package weekend.aistar.principle.dip.v1;
//司机类
public class Driver {
    //司机的行为
    //Driver类是依赖于Car类
    public void driver(Car car  ){
        car.run();
    }


    //司机会的技能提高
    //弊端 - 车的改变会影响到了司机

    //司机的技能一旦拓展了 - 当新增交通工具的时候,发现修改了driver类
    //Driver类违背了 开闭原则 - 对内禁止修改,对外允许扩展

    public void driverFireCar(FireCar car){
        car.run();
    }

}
class DriverTest{

    public static void main(String[] args) {
        Driver driver = new Driver();
        Car c = new Car();
        driver.driver(c);
    }
}