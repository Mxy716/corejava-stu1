package tech.aistar.day08;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("辉辉",99.0d);
//        System.out.println(dog.getName());
        System.out.println(dog);

        dog.sleep();
        dog.spark();

    }



}
