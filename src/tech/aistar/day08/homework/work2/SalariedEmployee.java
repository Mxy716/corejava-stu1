package tech.aistar.day08.homework.work2;
//固定月薪

import java.util.Date;

public class SalariedEmployee extends Employee {

    private double base;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, Date birthday, double base) {
        super(name, birthday);
        this.base = base;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+base;
    }
}
