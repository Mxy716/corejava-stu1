package tech.aistar.day04;

import java.util.GregorianCalendar;

//求某年某月最大天数的
public class SwitchMaxDaysDemo {
    public static void main(String[] args) {
        getMaxDay(2023,3);
    }

    public static int getMaxDay(int year, int month) {
     return    switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                return 31;
//            case 2:
//                return new GregorianCalendar().isLeapYear(year)?29:28;
//            default:
//                return 30;
            //jdk17的语法
         case 1,3,5,7,8,10,12 ->{yield 31;}
         case 2 -> new GregorianCalendar().isLeapYear(year)?29:28;
         default -> 30;


        };
    }
}
