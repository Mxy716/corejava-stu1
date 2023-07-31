package weekend.aistar.day10.interfaces;

public class UserDaoTest {
    public static void main(String[] args) {
        //接口不能够被实例化
        //IUserDao userDao = new IUserDao();

        //调用静态方法
        IUserDao.testStatic();

        //对象的编译时类型写成接口,对象的运行时类型写成实现类
        IUserDao userDao = new UserDaoImpl();
        userDao.test();//接口中的普通方法

        userDao.find();
        userDao.change();
        System.out.println("=========");

        //对象的编译时类型决定可它的访问能力 - 只能访问到编译是类型定义的成员

        IUserDao  dd = new UserDaoSubImpl2();
        dd.find();


        //instanceof - 类型检测 - 运行时类型的检测
        System.out.println(dd instanceof IUserDao);//true
        System.out.println(dd instanceof UserDaoImpl2);//true
        System.out.println(dd instanceof IBaseDao);//true


    }
}
