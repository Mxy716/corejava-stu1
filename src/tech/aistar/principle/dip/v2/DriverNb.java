package tech.aistar.principle.dip.v2;

public class DriverNb {
    public void driver(Vehicle v){
        v.run();
    }

}
class TestDriverNb{
    public static void main(String[] args) {
        DriverNb driverNb = new DriverNb();
        Vehicle car = new Car();
        driverNb.driver(car);
        System.out.println("======");

        Vehicle fireCar = new FireCar();
        driverNb.driver(fireCar);
    }
}