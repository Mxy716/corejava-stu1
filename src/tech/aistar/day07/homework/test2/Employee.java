package tech.aistar.day07.homework.test2;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Employee boss;
    private Employee[] emps;
    //定义员工的个数
    private int empsCount;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.emps = new Employee[100];
        this.empsCount = 0;
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

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    // 添加下属的方法
    public void addEmps(Employee employee) {
        emps[empsCount] = employee; // 将新员工添加到下属数组中
        employee.setBoss(this); // 设置新员工的上司为当前员工
        empsCount++; // 下属人数加一
    }

    // 输出自己所属下属的方法
    public void printEmps() {

        for (int i = 0; i < empsCount; i++) {
            System.out.println(emps[i].getName()); // 打印出每个下属的姓名
        }
    }

    // 获取下属员工数组
    public Employee[] getEmps() {
        return emps;
    }

    // 获取下属员工个数
    public int getEmpsCount() {
        return empsCount;
    }
}
