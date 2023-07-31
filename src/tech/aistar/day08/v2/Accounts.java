package tech.aistar.day08.v2;

public class Accounts {
    private int id;
    private String accNo;
    private Double balance;

    public Accounts() {
    }

    public Accounts(int id, String accNo, Double balance) {
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


}
