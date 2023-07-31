package tech.aistar.day08.exercise01;

public class Worf extends Animal {
    private String name;
    private double weight;

    public Worf(String name, double weight) {
        //super();
        System.out.println("===3===");
        //一定是献给所有的成员数行分配空间和初始化,然后才会调用构造方法
        this.name = name;
        this.weight = weight;
    }
    //子类重写了,执行的是子类的
    public String getDesc(){
        System.out.println("===2===");
        return "Worf:"+name+",Weight:"+weight;
    }

    public static void main(String[] args) {
        System.out.println(new Worf("泰迪",10));
    }

}
