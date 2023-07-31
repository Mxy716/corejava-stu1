package weekend.aistar.day03;
/**
 * 本来用来演示: 方法的参数列表
 *
 * 参数 - "原材料"
 * 方法 - "工厂"
 *
 * 参数的分类
 * 1. 形参 - 方法的参数列表中声明的变量(参数变量) - 没有实际的值
 * 2. 实参 - 调用方法时候传入的参数 - 有实际的值
 *
 */
public class ParamMethodDemo {
    public static void main(String... args) {
        //调用方法的时候传参的时候的注意点
        //1. 传入的参数的个数还是位置以及它的类型都需要和形参高度保持一致.

        //此处真正调用方法的时候,传入的参数就是属于实参
        String result = test01(18,"mxy");
        System.out.println(result);
        test02(2,1);
    }
    public static String test01(int a,String b){
        return a +":" +b;
    }
    /**
     * 无固定长参数列表
     * @param nums 当成数组来处理 - 对象类型
     */
    public static void test02(int... nums){
        System.out.println(nums.length);//数组的长度

        //TODO... 遍历数组
        /*
           for(元素类型 变量:数组对象名){
               //变量代表的就是数组中每个元素
           }
         */
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
