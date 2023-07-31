package weekend.aistar.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strSdf = sdf.format(date);
        System.out.println(strSdf);

        System.out.println("=====将字符串解析成Date====");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2022-07-16";

        try {
            Date date1 = sdf2.parse(s);
            System.out.println("date1:"+date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
