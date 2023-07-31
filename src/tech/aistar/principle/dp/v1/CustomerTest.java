package tech.aistar.principle.dp.v1;

public class CustomerTest {
    public static void main(String[] args) {
        //1.创建房地产公司
        HouseCompany company = new LouPanHouse("碧桂园");

        //2.中介公司
        MiddlerCompany middler = new Middler("琪琪",company);

        //3.卖家
        Customer c = new Customer(middler);
        c.buyHouse();
    }
}
