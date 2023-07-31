package tech.aistar.day10.interfaces;

/**
 * 本来用来演示:
 * 类可以实现多个接口,多个接口用逗号隔开.如果这个实现类是非抽象的
 * 那么必须要实现  实现的接口中所有的抽象方法
 * `除非这个实现类本身就是一个抽象的实现类`
 */
public abstract class UserDaoImpl2 implements IUserDao,IBaseDao {
    @Override
    public void save() {
        System.out.println("save2...");
    }

    @Override
    public void find() {
        System.out.println("find...");
    }
}
class  UseDaoSubImpl2 extends UserDaoImpl2{

    @Override
    public void change() {
        System.out.println("change2...");
    }
}