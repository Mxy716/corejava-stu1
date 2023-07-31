package tech.aistar.day08.homework.work2;

import java.util.Date;

//销售人员
public class SalesEmployee extends Employee {

    private double sales;

    private double rank;

    public SalesEmployee() {
    }

    public SalesEmployee(String name, Date birthday, double sales, double rank) {
        super(name, birthday);
        this.sales = sales;
        this.rank = rank;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+sales*rank;
    }
}
