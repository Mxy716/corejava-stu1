package tech.aistar.day08.v2;

public class AccountsBizTest {
    public static void main(String[] args) {
        Accounts acc = new Accounts(1,"mxy",400.0d);

        AccountsBiz biz = new AccountsBiz();
        biz.deposit(acc,200.0);
        biz.withDraw(acc,500.0d);
        System.out.println(acc.getBalance());
    }
}
