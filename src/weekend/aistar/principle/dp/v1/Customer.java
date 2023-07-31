package weekend.aistar.principle.dp.v1;
/*
* 客户
* */
public class Customer {
    //最少知道原则
    //依赖倒置原则 - 由维护具体到维护抽象

    private MiddlerCompany middlerCompany;

    public Customer(MiddlerCompany middlerCompany) {
        this.middlerCompany = middlerCompany;
    }
    public void buyHouse(){

    }
}
