package tech.aistar.day08.exercise01;

public class Super {
    int i =10;
    public Super(){
        System.out.println("===1===");
        print();
        i=20;

    }
    public void print(){
        System.out.println("===干扰===");
        System.out.println(i);
    }
}
