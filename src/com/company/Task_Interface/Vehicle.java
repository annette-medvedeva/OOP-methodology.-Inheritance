package com.company.Task_Interface;

interface IVehicle {
    void setName(String name);
    String getName();

    int getPrice();
    void setPrice(int price);

    double getVelocity();
    void setVelocity(double velocity);

    int getYear();
    void setYear(int year);

    void move(Coordinates coordinates);
}