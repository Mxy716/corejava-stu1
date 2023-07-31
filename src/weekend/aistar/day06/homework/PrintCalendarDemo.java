package weekend.aistar.day06.homework;

import tech.aistar.until.DateUtil;

import java.util.Calendar;
import java.util.Scanner;

public class PrintCalendarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:>");
        int year = sc.nextInt();
        System.out.println("请输入月份:>");
        int month = sc.nextInt();
        test(year, month);
    }

    private static void test(int year, int month) {
        System.out.println("\t\t" + year + "年" + " " + month + "月");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //某年某月最大天数
        int maxDay = DateUtil.getMax(year, month);
        //某年某月某日(1号)是周几
        int week = DateUtil.getWeek(year, month, 1);

        //获得今天是几号
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);


        int count = 0;
        for (int i = 0; i < week; i++) {
            System.out.print("\t");
            count++;
        }
        for (int i = 1; i < maxDay; i++) {
            if (i==day){
                System.out.print(i+"*\t");
            }else
            {
                System.out.print(i+"\t");
            }
            count++;
            if (count==7){
                System.out.println();
                count=0;
            }
        }
    }


}
