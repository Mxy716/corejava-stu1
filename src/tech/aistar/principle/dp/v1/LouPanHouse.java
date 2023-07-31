package tech.aistar.principle.dp.v1;

public class LouPanHouse implements HouseCompany {
    private String name;

    public LouPanHouse(String name){
        this.name=name;
    }


    @Override
    public String houseInfo() {
        return "开发商名:"+name+"价格:23000/m2";
    }
}
