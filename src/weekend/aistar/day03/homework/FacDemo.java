package weekend.aistar.day03.homework;
/**
 * 本来用来演示: 用for循环实现
 *             斐波那契数列
 */
public class FacDemo {
    public static void main(String[] args) {

        System.out.println(fei(8));
        System.out.println(jie(6));

    }
    public static int fei(int n){
        if (n<=2){
            return 1;
        }
     //定义一个变量 - result - n对应位置的值
        int result = 0;
        int start =1;
        int end = 1;
        for (int i = 3; i <= n; i++) {
            result=start+end;
            start=end;
            end=result;
        }
        return result;
    }

    public static  int jie(int n ){
        int result =1;
        for (int i = 1; i <= n; i++) {
           result=i*result;
        }
        return result;
    }
}
