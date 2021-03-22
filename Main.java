package Homework;

public class Main {
    public static void main(String[] args) {
    Box box1 = new Box(100);
    box1.add(new Square(2,2));
    box1.add(new Circle(5));
    box1.add(new Triangle(4,5));
        System.out.println(box1);
    }
}
