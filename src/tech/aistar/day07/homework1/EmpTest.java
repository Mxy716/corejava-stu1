package tech.aistar.day07.homework1;

public class EmpTest {
    public static void main(String[] args) {

        Emp boss = new Emp(1,"mxy",8000.0d,new Emp[0]);
        Emp e1 = new Emp(2,"chh",8000.0d,null   );
        Emp e2 = new Emp(3,"zmy",8000.0d,null);
        boss.addEmp(e1);
        boss.addEmp(e2);
        boss.getAllEmp();
        boss.getLen();
    }
}
