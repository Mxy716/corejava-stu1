package tech.aistar.day03;

public class NaiTea {
    public static void main(String[] args) {
        //定义一个被数
        int cup = 5;
        //定义一个价格
        double price = 10.0d;
        //定义一个方法 -计算总价
        double total = getTotal(cup, price);
        System.out.println("total:" + total);
    }

    private static double getTotal(int cup, double price) {



        //自己的方法
//        double total = 0.0d;
//        if (cup % 2 == 0) {
//            total = (cup / 2) * (price / 2) + (cup / 2) * (price);
//
//        } else {
//            total = (cup / 2) * (price / 2) + (cup / 2) * (price) +price;
//        }
//        return total;


        //TODO...
        // 定义一个变量,用来保存总价
        double total = (cup/2)*(price/2) + (cup/2)*price;

        //判断cup是否为奇数
        if((cup & 1) == 1)
            total += price;//total = total + price

        return total;
    }
}
