package com.company.ClassWork2;

import java.util.Arrays;

public class Garage {
    Vehicle [] base;

    @Override
    public String toString() {
        return "Garage: " +
                "base=" + Arrays.toString(base);
    }

    public Garage(Vehicle ... base){
        this.base= new Vehicle[base.length];
        for (int i = 0; i < this.base.length; i++) {
            this.base[i] = base[i];
        }
    }
}
