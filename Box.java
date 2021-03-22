package Homework;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List <Shape> shapes = new ArrayList<>();
    private int volume;
    private int capacity;

    public Box(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Box{ " +
                "shapes= " + shapes +
                ", volume= " + volume +
                ", capacity= " + capacity +
                " }";
    }

    public boolean add(Shape shape){
        if(shape.calcSquare()<(volume-capacity)){
            shapes.add(shape);
            capacity += shape.calcSquare();
            System.out.println("successfully added");
            return true;
        }
        System.out.println("no enough free volume");
        return false;
    }
}
