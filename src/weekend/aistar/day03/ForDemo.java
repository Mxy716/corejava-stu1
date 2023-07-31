package weekend.aistar.day03;
// for循环

public class ForDemo {
    public static void main(String[] args) {
        //1-3的数字输出
        for (int i = 1; i <= 3 ; i++) {
            System.out.print(i+"\t");
        }


        //其他写法.
        //变量的声明放在for循环的外部的

        //打印字母'a' - 'z'
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            System.out.print(c+"\t");
        }
        System.out.println();

        //输出Z - A
        for (int i = 90; i >=65;) {
            System.out.print((char) i+"\t");
            i--;
        }
        //三个表达式都省略了 - 死循环
//        for(;;){
//            System.out.println("死循环...");
//        }

        System.out.println();
        //for循环的复合形态
        for (int a = 0,n=20; a < 15&&n<=30;a+=2, n++) {
            System.out.println(a+":"+n+"\t");
        }
        System.out.println();

        //练习 - 单个for - 九九乘法表
        // i - 行
        // j - 列
        for (int i =1,j=1;j<=9;j++) {
            System.out.print(i+"*"+j+"="+i*j+"\t");
            if (i==j){
                i++;
                System.out.println();
                j=0;
            }
//                System.out.println(i + "*"+j+"="+i*j+"\t");


    }
}}
