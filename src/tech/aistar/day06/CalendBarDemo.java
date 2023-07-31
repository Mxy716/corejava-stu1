package tech.aistar.day06;
// 用来演示 java.util.Calendar


import java.util.Calendar;
import java.util.Date;

public class CalendBarDemo {
    public static void main(String[] args) {

        // 1. 创建日历对象
        //利用的是简单工厂的创建方式
        //设计模式 - 将对象的创建和对象的使用进行了解耦
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);

        //获取日历中各个字段的值
        //获取年份
        //int year = cal.get(1);//听过字面量 - 可读性比较差
        //Calendar.YEAR = 100;

        //利用Calendar日历类中定义的哪些公开的静态的常量属性进行传参.
        System.out.println(Calendar.YEAR);
        int year = cal.get(Calendar.YEAR);
        System.out.println("year:"+year);

        //[0,11]
        int month  = cal.get(Calendar.MONTH)+1;
        System.out.println("month:"+month);

        //获取几号
        int date = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("date:"+date);

        System.out.println("hours:"+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute:"+cal.get(Calendar.MINUTE));
        System.out.println("second:"+cal.get(Calendar.SECOND));

        //周几
        //周日是数字1 - Calendar
        //周日是数字0 - Date
        System.out.println("week:"+(cal.get(Calendar.DAY_OF_WEEK)-1));

    //因为Calendar中的字段比较多,可能只需要Date部分中的内容
        Date d = cal.getTime();
        System.out.println(d);//Mon Jul 24 15:08:29 CST 2023

        System.out.println("==========");
        Calendar calendar = Calendar.getInstance() ;
        //设置年份
        calendar.set(Calendar.YEAR,2022);
        calendar.set(2022,4,1);
//        Date dt =new Date(2010-1900,4,1);
//        //接着使用Date=>方法都是过时的
//        //Date类型=>Calendar类型
//        calendar.setTime(dt);
//
        System.out.println(calendar.getTime());

    }
}
