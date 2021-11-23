package com.company.ClassWork2;

public class Main {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle(100000, 20, 2020);
        System.out.println(vehicle);
        vehicle.move(new Coordinates(36, 42));

        Bicycle bicycle = new Bicycle(1000, 100, 2022, BicycleType.road, 8);
        System.out.println(bicycle);

        Plane plane =new Plane(1000,40,2020,56.3, 60);
        System.out.println(plane);
        Ship ship=new Ship (400,4,2010,4,2321);
        System.out.println(ship);

        Garage base= new Garage(new Plane(3000000,44,2000,23,2),
                new Bicycle(599,49,39,BicycleType.mountain,4),
                new Ship(1900000,20,75858,323,444));

        System.out.println(base);


    }
}
