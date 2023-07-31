package tech.aistar.day08.homework.work2;

import java.util.Date;

public class BasedPlusSalesEmployee extends SalesEmployee  {


    private double baseSalary;

    public BasedPlusSalesEmployee() {
    }

    public BasedPlusSalesEmployee(String name, Date birthday, double sales, double rank, double baseSalary) {
        super(name, birthday, sales, rank);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+baseSalary;
    }
}
