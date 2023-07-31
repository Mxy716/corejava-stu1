package weekend.aistar.day03;
//计算奶茶的价钱
public class NaiTeaDemo {
    public static void main(String[] args) {
        //定义了一个杯数
        int cup=5;
        //定义一个价格
        double price = 10.0d;
        //定义一个方法 - 计算总价
        double total = getTotal(cup,price);
        System.out.println("total:"+total);
    }
/*
* 逻辑 - 每第二杯半价
* 10 5 10 5 10
*
* */
    private static double getTotal(int cup, double price) {
//          自己写的
//        double total=0;
//        if (cup%2!=0){
//           total=(price+price/2)*((cup-1)/2)+price;
//        }else {
//            total=(price+price/2)*(cup/2);
//        }

//        老师写的
        double total = (cup/2)*(price/2) + (cup/2)*price;

        //判断cup是否为奇数
        if((cup & 1) == 1)
            total += price;//total = total + price

        return total;
    }
    }

