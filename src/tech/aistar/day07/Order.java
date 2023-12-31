package tech.aistar.day07;

import java.util.Date;

public class Order {
    private int id;
    private String ordNo;
    private double price;
    private Date createDate;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", ordNo='").append(ordNo).append('\'');
        sb.append(", price=").append(price);
        sb.append(", createDate=").append(createDate);
        sb.append('}');
        return sb.toString();
    }

    //定义一个空参构造
    //如果某个实体类中没有提供任何的构造方法的时候,系统会默认分配一个空参构造
    public Order() {//空参构造...
        System.out.println("空参构造");
    }

    //构造方法是允许重载的
    //一旦手动提供了带参构造,那么系统将不会再分配空参构造
    public Order(int id, String ordNo, double price) {
        System.out.println("三参构造~");
        this.id = id;
        this.ordNo = ordNo;

        //构造方法是可以直接调用setter方法=>当前这个属性需要校验
        //this.price = price
        setPrice(price);
    }


//    特殊一点的带参构造 - 全参构造
    public Order(int id, String OrdNo, double price, Date createDate) {
        System.out.println("全参构造...");
        this.id = id;
        this.ordNo = ordNo;
        this.price = price;
        this.createDate = createDate;
    }

    //getter/setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //setter方法是可以对数据惊醒校验
        if (price >= 500.0d) {
            this.price = 1.0d;
            return;
        }
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
