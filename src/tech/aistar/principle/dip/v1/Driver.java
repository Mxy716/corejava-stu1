package tech.aistar.principle.dip.v1;
//司机类
public class Driver {
    //司机的行为
    //Driver类是依赖于Car类
    public void driver(Car car){

        car.run();
    }
    //司机会的技能提高了

    public void driverFireCar(FireCar car){
        car.run();
    }

}
class DriverTest{
    public static void main(String[] args) {

        Driver driver = new Driver();
        Car c =new Car();
        driver.driver(c);
    }
}