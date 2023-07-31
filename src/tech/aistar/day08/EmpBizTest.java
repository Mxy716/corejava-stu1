package tech.aistar.day08;

public class EmpBizTest {
    public static void main(String[] args) {


    Emp boss = new Emp(1,"boss",2500.0d,new Emp[0]);
    Emp e1 = new Emp(2,"mark",1200.0d,null);

    EmpBiz biz = new EmpBiz();
    biz.addEmp(boss,e1);
    biz.getAllEmp(boss);
    biz.getLen(boss);
}
 }