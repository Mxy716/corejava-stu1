package tech.aistar.day03;

public class ParamMethodDemo {
    public static void main(String[] args) {
        String s = test01(18, "muxingyu");
        System.out.println(s);
    }

    public static String test01(int a, String b) {
        return a + ":" + b;
    }

    public static void test02(int... nums) {
        System.out.println(nums.length);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
