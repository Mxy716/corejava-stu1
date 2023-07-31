package tech.aistar.day03.homework;

public class DiamondDemo {
    public static void main(String[] args) {
        printDiamond2();


    }

    /**
     *        *
     *       *
     *      *
     *     *
     *    *
     *
     *    i = 0,j=4, i = 1,j=3
     *
     *    *
     *     *
     *      *
     *       *
     *        *
     *    i=0,j=4,  i=1,j=5   => 右上
     *
     *    *
     *     *
     *      *
     *       *
     *        *   左下
     *
     *     i=4,j=0  i=5,j=1
     *
     *               *
     *              *
     *             *
     *            *
     *           *
     *    i = 8 j=4   i=7 j=5
     *
     */
    //空心的菱形
    public static void printDiamond(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0;j<9;j++){
                if(i+j==4 || j-i==4 || i-j==4 || i+j==12){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    //实心的菱形
    public static void printDiamond2(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0;j<9;j++){
                if(i+j<4 || j-i>4 || i-j>4 || i+j>12){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }


}
