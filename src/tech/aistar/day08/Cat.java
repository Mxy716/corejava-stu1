package tech.aistar.day08;

public class Cat extends Animal {
    //假设color特有的属性
    private  String color;
    public Cat(){
        System.out.println("Cat()");
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void spark() {
        System.out.println("喵喵~~~");
    }

    public void catchMouse(){
        System.out.println("捉老鼠~~~");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return super.toString()+ sb.toString();
    }
}
