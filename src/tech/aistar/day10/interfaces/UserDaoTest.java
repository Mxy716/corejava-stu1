package tech.aistar.day10.interfaces;

public class UserDaoTest  {

    public static void main(String[] args) {
        //接口不能被实例化
//        IUserDao userDao = new IUserDao();

        //调用静态方法
        IUserDao.testStatic();

        //对象的编译时类型写成接口,对象的运行时类型写成实现类
        IUserDao userDao = new UserDaoImpl();
        userDao.test();//接口中的普通方法

        userDao.change();
        userDao.find();
        System.out.println("=======");


        //对象的编译时类型决定了它的访问能力 - 值能访问到编译时类型定义的成员
        //IUserDao dd = new UserDaoSubImpl2();
        IUserDao dd = new UseDaoSubImpl2();
        dd.find();

        //instanceof - 类型检测 - 运行时类型的检测
        System.out.println(dd instanceof IUserDao   );//true
        System.out.println(dd instanceof UserDaoImpl2);//true
        System.out.println(dd instanceof IBaseDao);//true


    }
}
