package tech.aistar.day07.v1;

import java.util.Arrays;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"admin",null);
        Ord[] ords = new Ord[1];
        Ord o =new Ord(1,"1001",c1);
        ords[0]=o;
        c1.setOrds(ords);
        System.out.println(c1);
        System.out.println(Arrays.toString(c1.getOrds()));
    }
}
