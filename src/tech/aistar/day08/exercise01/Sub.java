package tech.aistar.day08.exercise01;

public class Sub extends Super {
    int j = 30;

    public Sub() {
//        System.out.println(this);
//        super();//先走父类的
        System.out.println("===3===");
        print();
        System.out.println("===5===");
        j=40;

    }

    public void print(){
        System.out.println("==2==4==");
        System.out.println(j);

    }

    public static void main(String[] args) {
        //0 30 40
        System.out.println(new Sub().j);

    }
}
