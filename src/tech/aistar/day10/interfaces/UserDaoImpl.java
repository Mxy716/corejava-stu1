package tech.aistar.day10.interfaces;

public class UserDaoImpl implements IUserDao {
    @Override
    public void change() {
        System.out.println("change...");
    }

    @Override
    public void find() {
        System.out.println("find...");
    }
}
