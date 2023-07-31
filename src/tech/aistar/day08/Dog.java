package tech.aistar.day08;

//Animal类的子类
public class Dog extends Animal {
    //子类放自己特有的成员属性
    private double loyal;

    public Dog() {
        //如果子类构造中没有任何的super语句.那么默认会提供一个super()
        super();//调用父类的空参构造
        System.out.println("Dog()...");
    }

    public Dog(String name) {
        //setName(name);
        super(name);
        System.out.println("Dog(name)...");

    }

    //全参
    public Dog(String name, double loyal) {

        super(name);
        this.loyal = loyal;
    }

    //重写spark方法
    @Override
    public void spark() {
        System.out.println("汪汪~~~~");
    }

    //子类特有的成员方法
    public void watchDoor(){
        System.out.println("看家...");
    }

    public String toString() {
        //此类子类是允许直接访问父类中所有的非私有的成员
        //return "name:"+getName()+"=>loyal:"+loyal;

        //如果子类成员名称和父类成员名称发生冲突的时候,那么需要使用super.成员强制调用父类中的
        return "name:" + super.toString() + "=>lotal:" + loyal;
    }
}
