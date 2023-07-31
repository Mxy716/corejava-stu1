package tech.aistar.day08.homework.work2;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {


        HourlyEmployee e1 = new HourlyEmployee("穆星宇",new Date(),100,5);
        SalariedEmployee e2 =new SalariedEmployee("黄可为",new Date(),6000);
        SalesEmployee e3 = new SalesEmployee("zjq",new Date(),1000.0d,0.2);
        BasedPlusSalesEmployee e4 = new BasedPlusSalesEmployee("hyh",new Date(),100.0d,100.0d,4000.0d  );
        System.out.println(e4.getSalary(7));
        System.out.println(e3.getSalary(7));
        System.out.println(e2.getSalary(7));
        System.out.println(e1.getSalary(7));

    }


}
