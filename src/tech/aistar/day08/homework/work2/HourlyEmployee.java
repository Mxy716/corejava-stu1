package tech.aistar.day08.homework.work2;

import java.util.Date;

//小时工
public class HourlyEmployee extends Employee {
    //    每小时的工资、每月工作的小时数

    private int hoursSalary;
    private int hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, Date birthday, int hoursSalary, int hours) {
        super(name, birthday);
        this.hoursSalary = hoursSalary;
        this.hours = hours;


    }

    @Override
    public double getSalary(int month) {
        //先定义一个工资
      double  total =  hours*hoursSalary;

      if (hours>160){
          total=(hours*hoursSalary)+(hours*0.5*hoursSalary);
      }
      return super.getSalary(month)+total;
    }

}
