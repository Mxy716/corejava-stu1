package tech.aistar.day06;

import java.util.Date;

//java.util.Date 日期处理类
public class DateDemo {
    public static void main(String[] args) {
        //1.创建一个日期对象 - 原因是方法都是非静态的,必须使用对象来调用
        //创建对象 - api 手册构造

        //获取当前系统日期
        Date d = new Date();
        System.out.println(d);//Mon Jul 24 11:19:04 CST 2023

        //2.根据指定的年月日来构建指定的日期
        //month的范围[0,11]
        Date d2 = new Date(2023-1900,4,24);
        System.out.println(d2);//Wed May 24 00:00:00 CST 2023

        //3.获取当前系统时间的毫秒数 - 返回自1970年1月1日以来,由此Date对象表示的00:00:00 GMT的毫秒数

        long time1 = d.getTime();
        //唯一性- 订单号可以基于毫秒数 - 再次组合
        System.out.println(time1);

        long time2 = System.currentTimeMillis();
        System.out.println(time2);

        //根据指定的毫秒数来创建新的日期对象
        Date d3 = new Date(1690169039205l);
        //应用:日期对象本身是不能进行运算的
        System.out.println("d3:"+d3);

        //构建一个三天后的日期
        Date d4 = new Date(new Date().getTime()+3*24*60*60*1000);
        System.out.println(d4);

        System.out.println("=========关于获取日期中指定的字段=======");

        Date now = new Date();
        //获取年份
        int year = now.getYear()+1900;
        System.out.println("year:"+year);

        //获取月份
        int month = now.getMonth()+1;
        System.out.println("month:"+month);

        //星期鸡,周日是数字0 - 礼拜日是一周的开始[第一天]..
        System.out.println(now.getDay());
        System.out.println(now.getDate());
        System.out.println(now.getHours());
        System.out.println(now.getMinutes());
        System.out.println(now.getSeconds());


        System.out.println("=====日期字段的设置====");
        Date dt = new Date();
        dt.setYear(2022-1900);
        System.out.println(dt);

        System.out.println("=====void setTime(longf time)======");
        Date tt = new Date();
        tt.setTime(590167266581L);
        System.out.println("tt:"+tt);


    }

}
