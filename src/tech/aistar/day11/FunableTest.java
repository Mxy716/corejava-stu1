package tech.aistar.day11;

public class FunableTest  {
    public static void main(String[] args) {
        //匿名内部类的写法
//        Funable f1  = new Funable() {
//            @Override
//            public void test() {
//                System.out.println("test...");
//            }
//        };

        //如果函数体只能一行代码,{}是可以省略的
//        Funable f2 =()-> System.out.println("lambda..");

//        Funable f2 =()->{
//            System.out.println("test...");
//        };
//        f2.test();

        //带有参数
        //一行代码中的return是不需要不写的.
        Funable f3 =(m,n) -> m + n;
        System.out.println(f3.add(10,20));










    }
}
