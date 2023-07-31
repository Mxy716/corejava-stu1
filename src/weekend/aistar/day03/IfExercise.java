package weekend.aistar.day03;

import java.util.GregorianCalendar;

//经典的题目
public class IfExercise {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
        System.out.println(getMax(2023,2));

    }



    /**
     * 给定一个年份,判断是否为闰年
     *
     * 判断的有俩个,其中一个成立,就返回true
     * 1. 如果year能够直接被400整除 -> 返回true
     *
     * 2. 或者year能够被4整除但是不能够被100整除 -> 返回true
     */

    public static boolean isLeapYear(int year) {


        //写法一:
//        if(year%400==0 || (year%4==0 && year%100!=0)){
//            return true;
//        }else {
//            return false;
//        }

        //写法二:
        if(year%400==0 || (year%4==0 && year%100!=0))
            return true;
        return false;

        // 写法三:
        //return year%400==0 || (year%4==0 && year%100!=0);


    }





    /*
     *
     * 返回某年某月的最大天数
     * year 年份
     * month 月份
     * 最大天数
     *
     * */
    public static int getMax(int year, int month) {
        //在进行写逻辑前先进行参数的校验
        if (year <= 0) {
            System.out.println("sorry,year不合法");
            return -1;//错误的标识
        }
        if (month < 1 || month > 12) {
            System.out.println("sorry,month不合法");
            return -1;
        }
        //TODO.....真正的核心
        int day = -1;//变量在使用之前进行初始化
        if (year % 400 == 0 || year / 100 % 4 == 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                day = 31;

            } else if (month == 2) {

                //很多种写法...
                //写法一.
//            boolean flag = isLeapYear(year);
//            if(flag){
//                day = 29;
//            }else{
//                day = 28;
//            }

                //写法二
//            day = 28;
//            if(isLeapYear(year))
//                day++;

                //写法三 - 三元操作符   表达式/boolean值?result1:result2
                //day = isLeapYear(year)?29:28;

                //写法四 - 利用jdk内置的GregorianCalendar中提供的boolean isLeapYear(int year)
                day = new GregorianCalendar().isLeapYear(year)?29:28;
            } else {
                day = 30;
            }
        }


        return day;

    }
}
