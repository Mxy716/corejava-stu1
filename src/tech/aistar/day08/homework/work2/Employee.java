package tech.aistar.day08.homework.work2;

import java.util.Calendar;
import java.util.Date;

public class Employee {
    protected String name;
    protected Date birthday;

    public Employee() {
    }

    public Employee(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public double getSalary(int month){

        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);
        if (cal.get(Calendar.MONTH)==month){
            return 100.0d;
        }
        return 0.0d;
    }
}



