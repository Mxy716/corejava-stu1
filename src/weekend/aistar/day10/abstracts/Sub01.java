package weekend.aistar.day10.abstracts;

//如果一个非抽象的子类继承抽象父类,那么这个子类必须要重写这个抽象父类中所有的抽象方法

public class Sub01 extends SupAbstract {
    @Override
    public double area() {
        return 30.2;
    }

    @Override
    public double girth() {
        return 40.1;
    }
}
