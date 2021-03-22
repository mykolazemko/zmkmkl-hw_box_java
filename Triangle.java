package Homework;

public class Triangle extends Shape{
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public double calcSquare() {
        return width*height/2;
    }
}