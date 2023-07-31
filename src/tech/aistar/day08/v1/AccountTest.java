package tech.aistar.day08.v1;

public class AccountTest {
    public static void main(String[] args) {
        Account acc =new Account(1,"1001",100.0d);
        acc.deposit(200);
        acc.withDraw(50);
        System.out.println(acc.getBalance());
    }
}
