package weekend.aistar.day03;

public class TwoForDemo {
    public static void main(String[] args) {
        //外部循环执行一次,内层循环执行全部.

        //实心的矩形
        //内层循环和外部循环无关的.
        for (int i=0;i<=6;i++){
            for (int j=0;j<=15;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(">>>>>>>>>>>>");

        //空心的矩形
        for (int i=0;i<=6;i++){
            for (int j=0;j<=15;j++){
                if(i==0 || i==6 || j==0 || j==15){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(">>>>>>>>");

        //直角三角形
        //内层循环和外部循环相关的.
        for(int i=0;i<9;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
