package weekend.aistar.day07.v1;

import java.util.Arrays;

public class Customer {
    private int id;
    private String name;
    private Ord[] ords;

    public Customer() {
    }

    public Customer(int id, String name, Ord[] ords) {
        this.id = id;
        this.name = name;
        this.ords = ords;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ord[] getOrds() {
        return ords;
    }

    public void setOrds(Ord[] ords) {
        this.ords = ords;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", ords=").append(Arrays.toString(ords));
        sb.append('}');
        return sb.toString();
    }
}
