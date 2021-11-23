package com.company.Task_Interface;

import java.util.Arrays;

public class Garage {
    Abstract_Vehicle[] base;

    public Garage(Abstract_Vehicle... base) {  // Vehicle [] base
        this.base = base;
    }

    @Override
    public String toString() {
        return "Garage: " +
                "base=" + Arrays.toString(base);
    }

    public void print() {
        System.out.println(this.toString());

    }
}
