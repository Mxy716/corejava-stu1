package weekend.aistar.principle.crp.v2;



public class Computer {
    private Screen screen;

    public Computer(Screen screen) {
        //"语义"
        //聚合 - 整体不负责局部的生命
        this.screen = screen;
    }
}
