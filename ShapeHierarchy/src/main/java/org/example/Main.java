package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Circle(12));
        shapes.add(new Rectangle(12,10));
        shapes.add(new Triangle(10,20));
        for (Shape s:shapes)
        {
            System.out.println("Area of "+s.getClass().getSimpleName()+":"+s.area());
            System.out.println("Perimeter of "+s.getClass().getSimpleName()+":"+s.perimeter());
        }
        System.out.println("Sorting area");
        Collections.sort(shapes);
        for(Shape s:shapes)
        {
            System.out.println(s.getClass().getSimpleName()+":"+s.area());
        }
    }
}