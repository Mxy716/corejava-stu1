package tech.aistar.day10.extend;

public class Sup {

}
class Sub extends Sup implements IA{
    @Override
    public void a() {

    }//先继承,在实现

}
class SubTest{
    public static void main(String[] args) {
        Sup s = new Sub();
        IA s1 = new Sub();
        System.out.println(s instanceof IA);//true
        IA s2 = (IA) s;
    }
}