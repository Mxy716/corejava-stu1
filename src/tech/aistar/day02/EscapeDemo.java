package tech.aistar.day02;

public class EscapeDemo {
    public static void main(String[] args) {
        //\b -退格
        System.out.println("oo\bp");
        //\" - "
        System.out.println("他说:\"你好~\"");
        //\t -制表符   tab键
        System.out.println("hello\tworld");
        //\n 换行,输出完毕之后,光标停在下一行的起始位置
        System.out.println("hello\n");
        System.out.println("world");
        //\t 回车,输出完毕之后,光标停在当行的起始位置
        //idea=>tom
        //计算机终端 => tomin
        System.out.println("admin\rtom");

        //\转义
        System.out.println("\\");
        //输出\\
        System.out.println("\\\\");
        //面试的时候-输出的是计算机的路径
        System.out.println("D:\temp\news");
        //D:	emp
        //ews
        System.out.println("D:\\temp\\news");
    }
}
