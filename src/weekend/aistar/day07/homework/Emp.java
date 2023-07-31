package weekend.aistar.day07.homework;

import java.util.Arrays;

public class Emp {
    private int id;

    private String name;

    private double salary;

    //一个上司拥有多个下属
    private Emp[] emp;

    public Emp() {
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


    public void addEmp(Emp e ){
        if (emp==null){
            System.out.println("sorry,您没有权限进行添加!");
            return;
        }
        //1.先获取上司的emp数组,进行扩容
        //System.out.println(this.emp);
        emp=Arrays.copyOf(emp,emp.length+1);
        emp[emp.length-1]=e;


    }

    public void getAllEmp(){

        if (null!=emp&&emp.length>0){
            System.out.println("\t员工下属:");
            for (Emp e : emp) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("您还没有下属");
        }
    }

    //获取下属的个数
    public void getLen() {
        if (null!=emp&&emp.length>0){
            System.out.println(emp.length);
        }
        else {
            System.out.println("您还没有下属");
        }
    }

    }


