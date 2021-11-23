package com.company.ClassWork2;

public class Ship extends Vehicle {
    private int passengers;
    private int port;

    public Ship(int price, double velocity, int year, int passengers, int port) {
        super(price, velocity, year);
        this.setPassengers (passengers);
        this.setPort (port);
    }
    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "\nShip" +super.toString()+
                ", passengers=" + passengers +
                ", port=" + port;
    }

    public void setPassengers(int passengers) {
        this.passengers = (passengers>0?passengers:-1);
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = (port>0&&port<100000?port:-1);
    }
}
