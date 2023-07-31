package tech.aistar.day08.exercise01;

public class Animal {
    private String desc;
    public Animal(){
        System.out.println("====1===");
        //调用子类重写之后的getDesc();
        this.desc= getDesc();
    }
    public String getDesc(){
        System.out.println("干扰你的...");
        return "Animal";

    }
    public String toString(){
        System.out.println("==4==");
        return desc;
    }
}
