package tech.aistar.day04;

public class EnglishLoopDemo {
    public static void main(String[] args) {
        //定义一个变量-总和
        long sum = 1L;

        //定义一个变量 - 记录每圈的等差值.从2,每一圈都会自增2
        //凑巧 - 控制循环的圈数,正好500圈.
        int n = 2;

        //定义一个初始值
        int i = 1;

        while(n<5){//n<=1000
            //每一圈需要加4个值.
            //TODO i = i + n = 9 + 4 = 13
//            i += n;//i = i + n = 1 + 2
//            //TODO = sum = sum + i =  1 + 3 + 5 + 7 + 9 + 13
//            sum+=i;//sum = sum + i = 1 + 3
//
//            i += n;//i = i + n = 1 + 2 + 2 = 5
//            sum+=i;//sum = sum + i = 1 + 3 + 5
//
//            i += n;//i = i + n = 5 + 2 = 7
//            sum+=i;//sum = sum + i = 1 + 3 + 5 + 7
//
//            i += n;//i = i + n = 7 + 2 = 9
//            sum+=i;//sum = 1 + 3 + 5 + 7 + 9

            for (int j=0;j<4;j++){
                i += n;
                sum+=i;
            }

            n+=2;//n = 4
        }

        System.out.println(sum);//669171001
    }

}