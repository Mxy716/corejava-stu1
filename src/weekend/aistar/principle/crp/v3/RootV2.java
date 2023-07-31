package weekend.aistar.principle.crp.v3;

public class RootV2 {
    //合成服用原则 + 依赖倒置原则
    private RootV1 v ;

    public RootV2() {
        //组合替代继承的写法
        this.v = new RootV1();
    }

    public void run(){
        v.run();
        System.out.println("会泡...");
    }
}
class RootV2Test{
    public static void main(String[] args) {
        RootV2 v2 = new RootV2();

        v2.run();
    }
}