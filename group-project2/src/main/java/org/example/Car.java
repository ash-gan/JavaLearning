package org.example;

public class Car {

    double carPrice;
    String color;

    Car(String color, double price){
        this.color = color;
        this.carPrice = price;
    }

    public double calculateSalePrice(){
        return carPrice;
    }

}

class Sedan extends Car{

    double length;

    Sedan(String color, double price, double length) {
        super(color, price);
        this.length= length;
    }

    @Override
    public double calculateSalePrice(){
        double sedanPrice;
        if(length > 20){
            return sedanPrice = carPrice*0.05;
        }else{
            return sedanPrice= carPrice*.10;
        }
    }

}

class Truck extends Car{

    double weight;

    Truck(String color, double price, double weight) {
        super(color, price);
        this.weight = weight;

    }

    @Override
    public double calculateSalePrice() {
        double truckPrice;
        if(weight > 2000)
            return  truckPrice = carPrice*0.10;
        else
            return truckPrice = carPrice*0.20;
    }
}

class TestCars{
    public static void main(String[] args) {

        Sedan s = new Sedan("Blue", 28000, 33);
        Sedan s1 = new Sedan("Blue", 28000, 16);
        Truck t = new Truck("black", 43000, 2300);
        Truck t1 = new Truck("black", 43000, 1500);

        System.out.println(s.calculateSalePrice());
        System.out.println(s1.calculateSalePrice());
        System.out.println(t.calculateSalePrice());
        System.out.println(t1.calculateSalePrice());

    }
}



