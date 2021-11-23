package com.company.Task_Interface;

public class Coordinates {
    private double longtitude;
    private double latitude;

    public Coordinates(double longtitude, double latitude) {
        this.setLongtitude (longtitude);
        this.setLatitude (latitude);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                String.format("%5.2f", longtitude) +", "+
                String.format("%5.2f",latitude)+
                '}';
    }

    private void setLongtitude(double longtitude) {
        this.longtitude = (longtitude>=-180&&longtitude<=180?longtitude:0);
    }

    private void setLatitude(double latitude) {
        this.latitude = latitude>=-90&&latitude<=90?latitude:0;
    }
}
