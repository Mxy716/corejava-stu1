package weekend.aistar.day02;
//char类型的定义和使用
public class CharDemo {
    public static void main(String[] args) {
        char c='a'+1;//编译ok
        System.out.println("c:"+c);//b

        int n =1;
        char c2 = (char) ('a'+n);
        System.out.println("c2:"+c2);

        //补充int类型的定义
        //'a'->97 'A'->65
        int m ='0';//char类型自动转换成int类型
        System.out.println(m);//字符'0'对应的ascii码

        //char类型可以赋哪些值
        char c1 = 'a';
        char c3 = 65;
        System.out.println(c1+"and"+c3);
        char c4 = '中';
        System.out.println(c4);

        // \转义字符
//         \t - 制表符
//         \n - 换行,输出完毕之后,光标停在下一行的起始位置
//         \r - 回车,输出完毕之后,光标停在当前行的起始位置
//        \b,\n,\r - 你在idea的伪终端和计算机的终端呈现的效果可能是不一样的!
        char c5 = '\r';
        System.out.println("hello"+c5+"world");


    }
}
