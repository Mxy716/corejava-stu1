package tech.aistar.day07;

public class Course {
    //1.属性私有化
    //2.属性是不需要手动赋值的 - 由系统默认赋值
    private int id;
    private String name;

    //规范的操作和命名
    //规定统一使用getter来获取值 - get+属性名(首字母大写,其他单词不变)
    //规定统一使用setter来设置值 - set+属性名(首字母大写,其他单词不变)

    public  String getName(){
        return name;
    }
    public void setName(String name){
        //字符串的比较使用equals方法
        //setter方法可以对数据进行校验
       // System.out.println("this:"+this);

        //this代表当前对象 - 调用setName方法的对象
        //应用 - 成员方阿飞形参名与成员属性名产生冲突的时候,可以用this.属性来执行使用到的是成员属性
        if("xxx".equals(name)){
            this.name="***";
            return;
        }

        this.name=name;
    }
}
