package tech.aistar.day07;

//客户实体类 - 构造方法
public class Customer {
    private int id;
    private String name;
    private int age;

    //对象和对象之间是有关系的
    //一个客户拥有多个订单...
    private Order[] orders;

    public Customer() {
        System.out.println("空参构造");
    }

    public Customer(int id, String name) {
        //1.调用本类中的空参构造
        //2.this()必须在首行
        //this();
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, int age) {
        //1. 调用本类中的空参构造
        //2. this()必须在首行
        //this();
        this(id, name);//this调用两参构造
        System.out.println("三参构造~");
        //this.id = id;
        //this.cname = cname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", cname='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }


}
