package tech.aistar.day07.homework1;

import java.util.Arrays;

public class Emp {
    private int id;
    private String name;
    private double salary;

    //上司存放下属的
    private Emp[] emp;

    public Emp(){

    }

    public Emp(int id, String name, double salary, Emp[] emp) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.emp = emp;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp[] getEmp() {
        return emp;
    }

    public void setEmp(Emp[] emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", emp=").append(Arrays.toString(emp));
        sb.append('}');
        return sb.toString();
    }

    //业务方法
    public void addEmp(Emp e){

        if (emp==null){
            System.out.println("sorry,您没有权限进行添加");
            return;
        }
        //1.先获取上司的emp数组,进行扩容操作
//        System.out.println(this.emp);
        emp=Arrays.copyOf(emp,emp.length+1);
        emp[emp.length-1]=e;
    }

    //获取所有的下属 - 遍历
    public  void getAllEmp() {
        if (null != emp && emp.length > 0) {
            System.out.println("\t下属信息:>");
            for (Emp e : emp) {
                System.out.println("\t" + e);
            }

        }
    }
    //获取下属的个数
    public void getLen(){
        if (null!=emp&&emp.length>0){
            System.out.println("\t下属的个数:"+emp.length);
        }else {
            System.out.println("\tsorry,您还没有任何下属!先添加!");
        }
    }


}
