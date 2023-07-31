package tech.aistar.day08.v1;

public class Account {
    private int id;
    private String accNo;
    private Double balance;

    public Account() {
    }

    public Account(int id, String accNo, Double balance) {
        this.id = id;
        this.accNo = accNo;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", accNo='").append(accNo).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    //取钱
    public void withDraw(double money){

        if (money>this.balance){
            System.out.println("sorry,余额不足");
            return;
        }

        this.balance-=money;

    }
    //存钱
    public void deposit(double money){

        this.balance+=money;
    }

}
