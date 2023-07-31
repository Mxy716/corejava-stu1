package tech.aistar.day10.abstracts;

public class SupTest  {
    public static void main(String[] args) {
        //多态 - 编译时类型写成父类,运行时类型写成子类
        SupAbstract son = new Sub01();
        System.out.println(son.area());

        //因为SubAbs是一个抽象类 - 不能够被实例化
        //SupAbstract sonAb = new SubAbs();

        SupAbstract sun = new SubAbsSub();
        System.out.println(sun.area());
        System.out.println(sun.girth());

        System.out.println("====匿名内部类====");
        //Sub01还是SubAbs,SubAbsSub都是有名称的子类.
        //场景: 实现一个业务,就得定义一个子类 - 造成子类比较"臃肿"

        SupAbstract father = new SupAbstract() {
            @Override
            public double area() {
                return 700;
            }

            @Override
            public double girth() {
                return 800;
            }
        };
        System.out.println(father.area());
        System.out.println("======");

        System.out.println(new SupAbstract() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public double girth() {
                return 1000;
            }
        }.girth());
    }
}
