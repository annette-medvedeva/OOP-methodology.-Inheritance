package com.company.Task_Interface;


import java.time.LocalDate;

public abstract class Abstract_Vehicle implements IVehicle {
    String name = "";
    private Coordinates coordinates;
    private int price;
    private double скорость;
    private int year;
    private double velocity;


    public Abstract_Vehicle(Coordinates coordinates, int price, double velocity, int year) {
        this.coordinates = coordinates;
        this.setName(name);
        this.setPrice(price);
        this.setVelocity(velocity);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name= name.strip();
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price > 0 ? price : -1;
    }

    @Override
    public double getVelocity() {
        return this.скорость;
    }

    @Override
    public void setVelocity(double velocity) {
        this.velocity = velocity > 0.0D ? velocity : -1.0D;
    }

    @Override
    public int getYear() {
return this.year;
    }

    @Override
    public void setYear(int year) {
        this.year = (year > LocalDate.now().getYear() ? year : LocalDate.now().getYear());
    }
    public String toString() {
        Coordinates var10000 = this.coordinates;
        return "Vehicle{coordinates=" + var10000 + ", price=" + (this.price > 0 ? this.price : "n/a") + ", speed=" + (this.velocity > 0.0D ? (this.velocity + " ").trim() : "n/a") + ", year=" + (this.year > 0 ? this.year : "n/a") + "}";
    }
}
