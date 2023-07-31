package tech.aistar.day06.homework;

import tech.aistar.until.DateUtil;

import java.util.Calendar;
import java.util.Scanner;

public class PrintCalendarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:>");
        //1.将从键盘获取的输入的值赋值给变量year
        //2.此行代码会阻塞,知道用户输入enter键才会继续执行.
        int year = sc.nextInt();
        System.out.println("请输入月份:>");
        int month = sc.nextInt();

        test(year,month);

    }

    private static void test(int year, int month) {
        System.out.println("\t\t"+year+"年"+" "+month+"月");
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //1.某年某月的最大天数
        int maxDays = DateUtil.getMax(year,month);
        //2.某年某月某日是周几
        int week = DateUtil.getWeek(year,month,1    );
        //3.今天是记号 24*
        int now = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        //计数器
        int count =0;
        for (int i = 0; i < week; i++) {
            System.out.print("\t");
            count++;
        }
        for (int i = 1; i <= maxDays; i++) {
            System.out.print((i==now)?(i+"*\t"):(i+"\t"));
            count++;

            if (count==7){
                System.out.println();
                count=0;
            }
        }








    }
}
