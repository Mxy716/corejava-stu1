package tech.aistar.day08.homework.work1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rect(4, 6);
        shapes[2] = new Square(7);

        for (Shape shape : shapes) {
            shape.areaMethod();
            shape.girthMethod();
            shape.printAreaAndGirth();
            System.out.println();
        }
    }
}
