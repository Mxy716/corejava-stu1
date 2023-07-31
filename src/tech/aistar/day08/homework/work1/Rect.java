package tech.aistar.day08.homework.work1;

public class Rect extends Shape {

    private int len;
    private  int width;

    public Rect() {
    }

    public Rect(int len, int width) {
        this.len = len;
        this.width = width;
    }

    @Override
    public void areaMethod() {
        this.area = len*width;

    }

    public void girthMethod() {
       this.girth = 2*(len+width);
    }
}
