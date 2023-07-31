package tech.aistar.day08;
//测试多态
public class AnimalPolyDemo {
    public static void main(String[] args) {
        /*
        *对象的编译是类型写成父类,对象的运行是类型写成子类.
        *
        *   *编译时类型 对象名 = new 运行时类型();
        *
        *   *编译时类型决定了对象的访问能力-对象只能访问编译时类型中定义的成员
        *   *运行时类型决定了对象的行为能力 - 调用子类重写之后的方法

        * */

//        多态的定义 - 相同的动作给予不同的对象,会产生不同的执行结果.
        Animal dog = new Dog("旺财",100.0d);
        dog.spark();

        //非要访问Dog运行是类型的东西???
        //类型的强制转换 小的数字类型 变量 = (小的数据类型)变量;
        Dog d = (Dog) dog;
        d.spark();
        d.watchDoor();

        Animal cat = new Cat("咪咪","white");
        cat.spark();
        System.out.println("=======");

        Animal[] animals = new Animal[2];
        animals[0]=dog;
        animals[1]=cat;

        //在强制类型转换之前,需要先进行类型的判断 - instanceof
        //至于返回为true的,才能够转换
        System.out.println(cat instanceof  Animal);//true
        System.out.println(cat instanceof Cat);//true
        System.out.println(cat instanceof Dog   );//false

        for (Animal animal : animals) {
            animal.spark();
            if (animal instanceof  Dog){
               Dog dg =(Dog) animal;
               dg.watchDoor();
            }
            if (animal instanceof Cat){
                Cat ct = (Cat) animal;
                ct.catchMouse();
            }
        }
    }
}
