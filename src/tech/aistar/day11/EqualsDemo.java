package tech.aistar.day11;

public class EqualsDemo {
    public static void main(String[] args) {
        //一个类无论被实例化多少次,他在jvm内存中的那个Class实例
        Book b1 =new Book(1,"1001","西游记",100.0d);
        Book b2 =new Book(1,"1001","西游记",100.0d);
        Book b3 =new Book(2,"1002","红楼梦",550.0d);
        Book b4 = new Book(2,"1002","红楼梦",200.0d);
        BookInfo bi = new BookInfo(2,"abc");

        BookInfo bi1 =new BookInfo(2,"123");
//        System.out.println(b1==b2);//false
//        System.out.println(b1.getClass()==b2.getClass());//true
        //Object-equal方法 - 底层仍然是==
//        System.out.println(b1.equals(b2));//false

        //实际业务是需要根据对象的属性值的比较来决定是true/false
        //比如 规则:只要id一样,就认为是同一个对象,或者id以及isbn一样的时候,才认为是同一个对象.
        //重写equals
//        System.out.println(b1.equals(b2));//true

        //比较规则,当且仅当book的id以及bookInfo的id俩者高度保持一致的时候,才认为是同一个对象.
        b3.setBookInfo(bi);
        b4.setBookInfo(bi1);
        System.out.println(b3.equals(b4));

    }
}
