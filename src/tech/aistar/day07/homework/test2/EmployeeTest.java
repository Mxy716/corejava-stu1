package tech.aistar.day07.homework.test2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee boss = new Employee(1, "mxy", 10000.0);

        Employee employee1 = new Employee(2, "hkw", 5000.0);
        boss.addEmps(employee1);

        Employee employee2 = new Employee(3, "chh", 6000.0);
        boss.addEmps(employee2);

        boss.printEmps();

        System.out.println("员工的个数" + boss.getEmpsCount());
    }
}
