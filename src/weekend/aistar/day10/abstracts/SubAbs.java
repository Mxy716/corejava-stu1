package weekend.aistar.day10.abstracts;

public abstract class SubAbs extends SupAbstract {
    //虽然已经不需要强制重写父类中的抽象方法
    //但是还是可以手动重写抽象方法

    @Override
    public double girth() {
        return 90.0d;
    }
}
class  SubAbsSub extends SubAbs{

    @Override
    public double area() {
        return 200.0d;
    }


}