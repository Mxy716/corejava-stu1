package tech.aistar.day02;

public class CharDemo {
    public static void main(String[] args) {
        char c = 'a'+1;
        System.out.println("c:"+c);

        int n =1;
        char c2 = (char) ('a'+1);
        System.out.println(c2);

        //补充int类型的定义
        //'a'->97 'A'->65
        int m='0';//char类型自动转换成int类型
        System.out.println(m);//字符'0'对应的ascii码

        //char类型可以赋值那些值
        char c1 ='a';
        char c3 =65;
        System.out.println(c3);
        char c4 ='中';
        System.out.println(c4);
        //\是转义字符
        char c5 ='\n';
        System.out.println("hello"+c5+"world");
        //[\u0000,\uffff]
        char c6 ='\u03c0';//直接定义unicode编码 -十六进制

        System.out.println(c6);












    }
}
