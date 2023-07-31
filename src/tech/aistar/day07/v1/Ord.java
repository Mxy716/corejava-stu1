package tech.aistar.day07.v1;

public class Ord {
    private int id;
    private String ordNo;
    private Customer customer;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ord{");
        sb.append("id=").append(id);
        sb.append(", ordNo='").append(ordNo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Ord(int id, String ordNo, Customer customer) {
        this.id = id;
        this.ordNo = ordNo;
        this.customer = customer;
    }

    public Ord() {

    }
}
