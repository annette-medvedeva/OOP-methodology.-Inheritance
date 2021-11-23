package com.company.Task_Interface;

public class Ship extends Abstract_Vehicle{
    private int passengers;
    private String port;

    public Ship(Coordinates coordinates, int price, int speed, int year, int passengers, String port) {
        super(coordinates, price, speed, year);
        this.setPassengers(passengers);
        this.setPort(port);
    }
    public int getPassengers()
    {
        return this.passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers= passengers> 0 ? passengers : -1;
    }

    public String getPort() {

        return this.port;
    }

    public void setPort(String port) {

        this.port = port;
    }

    public String toString() {
        String res = super.toString();
        String var10000 = res.substring(0, res.length() - 1);
        res = "Ship " + var10000 + ", port=" + (!this.port.equals("") ? this.port : "n/a") + ", passengers=" + (this.passengers > 0 ? this.passengers : "n/a") + "}";
        return res;
    }

    public void print() {

        System.out.println(this.toString());
    }

    @Override
    public void move(Coordinates coordinates) {
    }

}



