package tech.aistar.day03;

public class ForDemo {
    public static void main(String[] args) {
        //1-3的数字输出
        for (int i = 0; i < 3; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        //其他写法
        //变量的声明放在for循环的外部的

        //打印字母'a'-'z'
        char c;
        for (c = 'a'; c <'z'; c++) {
            System.out.print(c+"\t");
        }

        System.out.println();
        //输出Z到A
        for (int i = 90; i >=65 ; i--) {
            System.out.print((char)i+"\t" );
        }
        System.out.println( );
        //表达式③省略了
        for (int i =90;i>=65;){
            System.out.print((char) i+"\t");
            i--;
        }

        //三个表达式都省略了 -死循环
//        for (;;){
//            System.out.println("死循环...");
//        }
        System.out.println();

        //for的复合形态
        for (int a = 10,n=20; a <15&&n<=30 ; a+=2,n++) {
            System.out.print(a+":"+n+"\t");
        }
        System.out.println();
        System.out.println("-------------");
        //练习九九乘法表
        //单个for i-行,j-列
        for (int i = 1,j=1; i<=9 ; j++) {
            System.out.print(i+"*"+j+"="+i*j+"\t");
                if (i==j) {
                      i++;
                      //换行
                    System.out.println();
                 //重置列
                    j=0;

                }
            }
        }
    }

