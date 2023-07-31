package tech.aistar.day07;

import tech.aistar.until.DateUtil;

public class OrderConstructorTest {
    public static void main(String[] args) {
        //通过new关键字来调用构造方法
        Order o1 = new Order();
        o1.setOrdNo("1002");
        o1.setOrdNo("1003");//setter方法允许多次赋值


        //对象是具体点,对象是类的实例化
       Order o2 = new Order(1,"1001",600.0d);

       //构造方法是不允许被多次赋值的,赋值的机会只有一次,就是创建对象的的时候

        //o2 = new Order(1,"1005",100.0d);

        //后期如果非要修改属性,只能通过setter方法
        //o2.setPrice(600.0d);

        System.out.println(o2.getId()+":"+o2.getOrdNo()+":"+o2.getPrice());
        System.out.println("====全参构造=====");

        //Order o3 = new Order(2,"2021",500.0d,new Date());

        Order o3 =new Order(2,"2021",500.0d, DateUtil.createDate(2023,6,1));

        System.out.println(DateUtil.format(o3.getCreateDate(),"yyyy-MM-dd"));
    }
}
