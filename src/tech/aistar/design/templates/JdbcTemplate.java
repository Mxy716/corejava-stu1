package tech.aistar.design.templates;

//模板设计模式
public abstract class JdbcTemplate {
    //抽象父类中可以实现子类重复的代码
    public void connect() {
        System.out.println("获取db连接...");
    }

    public void close() {
        System.out.println("关闭连接,释放资源");
    }
    //定义若干个业务需要执行的方法 - 抽象方法即可
    //各个子类的具体的实现是不一样的 - 细节就是有子类自己去决定

    //行为以及行为的顺序都是由父类控制的
    //"抽象方法" - 父类决定了核心需要做的事情
    public abstract void execute();

    //控制住业务执行的顺序 - 绝不能被改变
    public  final void task(){
        connect();
        execute();
        close();
    }





}
