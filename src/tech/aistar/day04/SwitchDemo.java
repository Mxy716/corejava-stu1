package tech.aistar.day04;

public class SwitchDemo {
    public static void main(String[] args) {
        int n = (int) (Math.random()*3+2);//[2,5)
        System.out.println("n:"+n);
        switch (n){
            case 2:
                System.out.println("2....");
                break;
            case 3:
                System.out.println("3.....");
                break;
            default:
                System.out.println("4........");
               // break;
        }
        System.out.println("outside..");
    }
}
