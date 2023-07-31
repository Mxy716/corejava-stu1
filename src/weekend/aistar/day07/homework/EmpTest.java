package weekend.aistar.day07.homework;

public class EmpTest {
    public static void main(String[] args) {



        Emp boss = new Emp(001, "mxy", 3000, new Emp[0]);

        Emp emp1 = new Emp(002, "mx", 3000, null);
        Emp emp2 = new Emp(003, "mx", 3000, null);

        boss.addEmp(emp1);
        boss.addEmp(emp2);

        boss.getAllEmp();
        boss.getLen();
    }
}
