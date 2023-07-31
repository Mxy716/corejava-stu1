package tech.aistar.day03.homework;

public class TestDemo04 {
    public static void main(String[] args) {
        //打印所有这样的组合,当这个组合是三位数,数字是有1,2,3,4当中的
        //三个组成.但是不能出现重复的数据,比如合法的1,2,3总共24个
        //  增加难度:每打印六个换一行!

int count =0;
        for (int i =1;i<5;i++){
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k <5 ; k++) {
                    if (i!=j&&i!=k&&j!=k){
                        System.out.print(i+""+j+k+"\t");
                        count++;
                        if (count==6){
                            System.out.println();
                            count=0;
                        }
                    }
                }

            }
        }


    }
}
