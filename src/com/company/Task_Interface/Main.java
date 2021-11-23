package com.company.Task_Interface;


public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship(new Coordinates(82, 39), 500000, 30, 2010, 200, "Odessa");
        ship.print();

        Garage base = new Garage(new Ship(new Coordinates(82, 39),66,33,2020,3,"gk"));
        base.print();
    }
}
