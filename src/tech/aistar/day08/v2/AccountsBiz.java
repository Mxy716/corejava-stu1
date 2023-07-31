package tech.aistar.day08.v2;

public class AccountsBiz {
    //取钱
    public void withDraw(Accounts acc,double money){

        if (money>acc.getBalance()){
            System.out.println("sorry,余额不足");
            return;
        }
        acc.setBalance(acc.getBalance()-money);

    }

    //存钱
    public void deposit(Accounts acc,double money){

      acc.setBalance(acc.getBalance()+money);
    }
}
