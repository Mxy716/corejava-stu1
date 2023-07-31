package tech.aistar.day06;

import tech.aistar.until.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//本来用来演示: 日期格式化
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //利用pattern来构建SimpleDateFormat对象
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

        //如果pattern出现一些非法字符 - 抛出java.lang.IllegalArgumentException非法参数异常
        // SimpleDateFormat sdf = new SimpleDateFormat("success");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //将日期格式化成日期/事件字符串
        String strDate = sdf.format(date);
        System.out.println(strDate);

        System.out.println("====将字符串解析成Date====");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        //1.字符串必须是日期形式
        //2.字符串的日期形式的格式必须要和SimpleDateFormat构造中的pattern的格式保持一致
        String str = "2023-04-01";

        //该方法需要我们手动抓取异常 - alt - enter

        try {
            //如过此行出现了异常(java.text.ParseException),那么进入到catch块去执行
            Date dd = sdf2.parse(str);
            System.out.println("dd:"+dd);
        } catch (ParseException e) {
           e.printStackTrace();//打印堆栈的异常信息
            System.out.println("sorry...出现了异常,可能模板不匹配~");
        }

        System.out.println("====DateUtil===");

        Date dt = DateUtil.parse(str,"yyyy-MM-dd");
        System.out.println(dt);

        String s =DateUtil.format(new Date(),"yyyy/MM/dd HH:mm:ss");
        System.out.println(s);


    }
}
