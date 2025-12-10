package org.example;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5*base*height;
    }

    @Override
    public double perimeter() {
        double hyp=Math.sqrt(base*base+height*height);
        return base+height+hyp;
    }
}
