package tech.aistar.day04;

public class WhileExercise {
    public static void main(String[] args) {

        System.out.println(getsum(456789));
    }

    private static int getsum(int n) {
        int count =0;
        while (true){
            int s =n/10;
            count++;
            if (s==0)
                break;
            n=s;

        }
       return count;
    }
}
