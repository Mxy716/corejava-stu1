package tech.aistar.day03;

public class IfDemo {
    public static void main(String[] args) {
        int n = 3;
        if(n<5)
            System.out.println("if-单独使用!");
        System.out.println("if块外面!");

        if(n>5)
            System.out.println("n>5!");
        else
            System.out.println("n<5!");

        //注意条件要互斥...
        double score = 98.0d;
        if(score>=90){
            System.out.println("及格!");
        }else if(score>=80){
            System.out.println("良好!");
        }else if(score>=60){
            System.out.println("及格!");
        }else{
            System.out.println("作弊!");
        }
    }
}
