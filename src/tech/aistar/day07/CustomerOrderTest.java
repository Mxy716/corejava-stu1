package tech.aistar.day07;

import java.util.Date;

//客户实体类 - 构造方法
public class CustomerOrderTest {
    public static void main(String[] args) {
        //1.定义一个客户
        Customer c = new Customer(1,"admin",30);

        //2.下单
        //模拟若干个订单
        Order o1 =new Order(1,"1001",300.0d,new Date()  );
        Order o2 = new Order(2,"1002",500.0d,new Date());

        Order[] orders = new Order[2];
        orders[0] = o1;
        orders[1] = o2;

        //将订单数组设置到客户对象上
        c.setOrders(orders);

        System.out.println(c);
        System.out.println("\t订单信息");

        Order[] oo = c.getOrders();
        for (Order order : oo) {
            System.out.println(order);
        }


    }




}
