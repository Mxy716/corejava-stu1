package tech.aistar.day11;

public class ClassDemo {
    public static void main(String[] args) {
        Object o = new ClassDemo();
        Class<?> c1 = o.getClass();

        System.out.println(c1);//class tech.aistar.day11.ClassDemo

        System.out.println(c1.getName());//tech.aistar.day11.ClassDemo

        System.out.println(c1.getSimpleName());//ClassDemo



    }
}
