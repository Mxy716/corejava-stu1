package tech.aistar.principle.crp.v1;

public class Baby {

    //人的身体(baby)- 整体

    //头 - 身体的部分

    private Header header;

    public Baby(){
        System.out.println("Baby...");
        this.header = new Header();
    }
}
class BabyTest{
    public static void main(String[] args) {
        Baby b =new Baby();
    }
}