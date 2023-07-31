package tech.aistar.day08;

//动物的父类
public class Animal {//继承Object
    //动物的名称
    private String name;

    //空参构造
    public Animal() {
        System.out.println("Animal空参...");
    }

    //一参构造...
    public Animal(String name) {
        System.out.println("Animal(name)...");
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //共性的成员方法
    public void sleep() {
        System.out.println(name + "在睡觉!");
    }

    //why? 意义在哪里
    public void spark() {
        System.out.println("动物在叫");

    }


    @Override
    public String toString() {
        return "name:" + name;
    }
}
