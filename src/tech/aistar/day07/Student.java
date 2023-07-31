package tech.aistar.day07;
//学生实体类 - 描述学生对象的
public class Student {
    //没有进行封装 - 外部是可以直接操作这些数据的
    //属性 - 成员变量

    public int id = 1;

    //如果没有手动赋值,系统自动赋值
    public  int age;
    public  String name = "admin";
    public String[] hobbies ={"coding","sleeping"};
}
