package weekend.aistar.day06;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //获取日历中各个字段的值
        //获取年丰
        //int year = cal.get(1);//通过字面量 - 可读性比较差
        //Calendar.YEAR =100;

        //利用Calendar日历类中定义的哪些公开的静态的常量属性进行传参
        System.out.println(Calendar.YEAR);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);


        //month [0,11]
        int month = cal.get(Calendar.MONTH)+1;
        System.out.println(month);

        //获取几号
        int date = cal.get(Calendar.DATE);
        System.out.println(date);
        System.out.println("======");

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        //因为Calender中的字段比较多,可能只需要Date部分中的内容
        Date d = cal.getTime();
        System.out.println(d);

        System.out.println("========");

        Calendar calendar =Calendar.getInstance();
        //设置年份
        //calendar.set(2022,4,1);

        Date dt = new Date(2010-1900,4,1);
        calendar.setTime(dt);
        System.out.println(calendar.getTime());











    }
}
