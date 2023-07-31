package tech.aistar.day04;

public class SwitchPlusPlusDemo {
    public static void main(String[] args) {
        int i =1;
        int j =1;
        int n =2;
        switch (n){
            case 1:
                i++;
                j--;
            case 2:
                ++i;//2
                --j;//0
                //没有break语句,则会继续走下一个case
            case 3:
                i++;//3
                j++;//1
                //没有break语句,则会继续走下一个case
                //break;
            default:
                --i;//2
                j--;//0
        }
        System.out.println("i:"+i );
        System.out.println("j:"+j);
    }
}
