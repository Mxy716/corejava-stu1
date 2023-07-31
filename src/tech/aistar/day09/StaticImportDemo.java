package tech.aistar.day09;

import java.util.Calendar;


public class StaticImportDemo {

    public static void main(String[] args) {
        Calendar cal  = Calendar.getInstance();
        //静态的属性才能够静态导入
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);

    }
}
