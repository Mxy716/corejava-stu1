package tech.aistar.day08;

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
        sb.append('}');
        return sb.toString();
    }
}
