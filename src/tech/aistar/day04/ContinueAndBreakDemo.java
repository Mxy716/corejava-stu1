package tech.aistar.day04;

public class ContinueAndBreakDemo {
    public static void main(String[] args) {
//        continueTest();
//        breakTest();
//        breakTest2();
        breakCodeBlock();

    }

    private static void breakCodeBlock() {
        int i =28;
        //命名的代码块
        qiqi:{
            if (i>=28) {
                break qiqi;
            }
            System.out.println("age...");
        }
        System.out.println("outer..");
    }

    private static void breakTest2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==2){
                    break;//跳出它当前所在的循环-内部的循环
                }
                System.out.println(i+":"+j);
            }

        }
        System.out.println("end.......");
    }


    private static void continueTest() {
        for (int i = 0; i < 5; i++) {
            if (i==3){
                continue;
                //跳过本轮循环,但是会继续下一轮循环.continue语句下面是不能够出现代码的
                //continue语句只能出现在循环体中
            } System.out.println(i);
        }
        System.out.println("=============");
    }

    private static void breakTest() {
        for (int i =0; i <5 ; i++) {
            if (i==3){
                break;//跳出它所在的那一层的循环
            }
            System.out.print(i);
        }
        System.out.println("end....");
        System.out.println("=====================");
    }


}
