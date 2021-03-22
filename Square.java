package Homework;

public class Square extends Shape{
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public double calcSquare() {
       return width*height;
    }
}
