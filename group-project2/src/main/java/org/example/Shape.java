package org.example;


import sun.plugin.net.protocol.jar.CachedJarURLConnection;

public interface Shape{

    public double calculateArea();

    public double calculatePerimiter();

}

class Circle implements Shape{

    double radius;

    Circle(double radius){
        this.radius= radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }

    @Override
    public double calculatePerimiter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}

class Square implements Shape{

    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(side, 2);
        return area;
    }

    @Override
    public double calculatePerimiter() {
        double perimeter = 4 * side;
        return perimeter;
    }

}
class Task8Interface {
    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        Square s1 = new Square(4);

        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimiter());
        System.out.println(s1.calculateArea());
        System.out.println(s1.calculatePerimiter());
    }
}
