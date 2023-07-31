package tech.aistar.day08.homework.work1;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double area, double girth, double radius) {
        super(area, girth);
        this.radius = radius;
    }

    @Override
    public void areaMethod() {
        this.area = PI * radius * radius;
    }

    @Override
    public void girthMethod() {
        this.girth = (2 * PI * radius);
    }

}
