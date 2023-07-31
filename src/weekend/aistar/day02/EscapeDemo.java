package weekend.aistar.day02;
//转义字符
public class EscapeDemo {
    public static void main(String[] args) {
        //\b - 退格
        System.out.println("oo\bp");

        // \"
        //输出 他说:"穆星宇";
        System.out.println("他说:\"穆星宇\"");

        // \t -制表符 Tab键
        System.out.println("Hello\tWorld");

        // \n 换行,输出完毕之后,光标停在下一行的起始位置
        System.out.println("hello\n");
        System.out.println("world");

        //\r 回车,输出完毕之后,光标停在当前行的起始位置
        //idea = >tom
        //计算机终端 = >tomin
        System.out.println("admin\rtom");

        // \转义
        System.out.println("\\");

        //输出\\
        System.out.println("\\\\");

        //面试的时候 - 输出的是计算机中的路径
        //System.out.println("D:\temp\news);
        System.out.println("D:\\temp\\news");
        System.out.println(-10>>2);//位运算符
    }


}
