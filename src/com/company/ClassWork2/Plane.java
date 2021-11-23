package com.company.ClassWork2;

public class Plane extends Vehicle {
    private double height;
    private  int passengers;

    public Plane(int price, double velocity, int year,double height, int passengers) {
        super(price, velocity, year);
        this.setHeight (height);
        this.setPassengers (passengers);
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "\nPlane " + super.toString()+", "+
                ", height=" + height +
                ", passengers=" + (passengers<0?"error":passengers);
    }

    public void setHeight(double height) {
        this.height = (height<0&& height>10000000? height:-1);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = (passengers<0?-1:passengers);
    }
}
