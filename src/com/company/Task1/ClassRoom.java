package com.company.Task1;

import java.util.Arrays;

public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom(Pupil... pupils) {
        this.pupils = new Pupil[pupils.length];
        for (int i = 0; i < this.pupils.length; i++) {
            this.pupils[i] = pupils[i];
        }
    }

    @Override
    public String toString() {
        String result = "ClassRoom: ";
        for (Pupil pupil : pupils) {
            result += System.lineSeparator() + pupil;
        }
            return "ClassRoom{" +
                    "pupils=" + Arrays.toString(pupils) +
                    '}';
        }
    }

