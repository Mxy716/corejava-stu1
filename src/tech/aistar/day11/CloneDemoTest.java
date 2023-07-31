package tech.aistar.day11;

import java.util.Date;

//克隆
public class CloneDemoTest {
    public static void main(String[] args) {
        Book b3 = new Book(1,"1001","西游记",100.0d,"神仙小说",new Date());
        BookInfo info1 = new BookInfo(1,"abc");
        b3.setBookInfo(info1);

        //浅拷贝的特点
        //1.修改元对象的基本数据属性,String,Date类型都不会对副本对象产生影响
        //2.修改对象类型,会对副本对象造成影响
        try{
            //被克隆的对象一定要实现java.lang.Cloneable接口
            //为什么使用克隆,不自己去new
            //克隆是不会走构造方法 - 直接在内存进行复制的
            Book copy = (Book) b3.clone();

            //TODO... 修改原对象
            b3.setId(2);//修改的是基本类型
            b3.setIsbn("1002");//

            //修改对象类型
            b3.getBookInfo().setId(100);

            //TODO... 观察副本对象
            System.out.println(copy);
            System.out.println(copy.getBookInfo());


        }catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }



    }
}
