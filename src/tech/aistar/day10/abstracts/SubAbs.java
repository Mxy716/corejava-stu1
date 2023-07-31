package tech.aistar.day10.abstracts;
//抽象子类
public abstract class SubAbs extends SupAbstract {


 //虽然已经不需要强制重写抽象父类中的抽象方法
    //打死你hi还是可以手动重写抽象方法的




    @Override
    public double girth() {
        return 90.0d;
    }
}
class SubAbsSub extends SubAbs{
    @Override
    public double area() {
        return 200.0d;
    }
}