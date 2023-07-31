package tech.aistar.day08;



import java.util.Arrays;

public class EmpBiz {
    //业务方法
    public void addEmp(Emp boss,Emp e){
        Emp[] emp =  boss.getEmp();

        if (emp==null){
            System.out.println("sorry,您没有权限进行添加");
            return;
        }
        //1.先获取上司的emp数组,进行扩容操作
//        System.out.println(this.emp);
        emp= Arrays.copyOf(emp,emp.length+1);
        emp[emp.length-1]=e;
        boss.setEmp(emp);
    }

    //获取所有的下属 - 遍历
    public  void getAllEmp(Emp boss) {
        Emp[] emp = boss.getEmp();
        if (null != emp && emp.length > 0) {
            System.out.println("\t下属信息:>");
            for (Emp e : emp) {
                System.out.println("\t" + e);
            }

        }
    }
    //获取下属的个数
    public void getLen(Emp boss){
        Emp[] emp = boss.getEmp();
        if (null!=emp&&emp.length>0){
            System.out.println("\t下属的个数:"+emp.length);
        }else {
            System.out.println("\tsorry,您还没有任何下属!先添加!");
        }
    }

    //开除工资高于salary的下属
    public void delBySalary(Emp boss,double salary){
        Emp[] emps = boss.getEmp();
        if (null!=emps&&emps.length>0){
            //统计出工资高于salary的下属的个数
            int count =0;//计数器
            for (int i = 0; i < emps.length; i++) {
                if (emps[i].getSalary()>=salary){
                    count++;
                }
            }
            //判断是否存在
            if (count==0){
                System.out.println("sorry,不存在!");
                return;
            }
            //确定新的数组的长度,新的数组是不包括和工资大于等于salary的下属
            Emp[] temp =new Emp[emps.length-count];
            //下标计数器
            int pos = 0 ;
            //遍历原来的下属的数组
            for (int i = 0; i < emps.length; i++) {
                if (emps[i].getSalary()<salary){
                    temp[pos++]=emps[i];
                }
            }
            //temp指向的数组对象
            //重新设置一下
            boss.setEmp(temp);
        }else {
            System.out.println("\tsorry,您还没有任何下属!先添加!");
        }
    }

}
