package tech.aistar.principle.dp.v1;

public class Middler implements MiddlerCompany {

    private String name;
    private HouseCompany company;

    @Override
    public void displayHouse() {
        System.out.println(name+"手上有的房源是:"+company.houseInfo());
    }

    public Middler(String name, HouseCompany company) {
        this.name = name;
        this.company = company;
    }
}
