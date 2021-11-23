package com.company.Task1;

public class GoodPupil extends Pupil {
    public GoodPupil(String name,int stage){
        super (name, stage);
    }
    @Override
    public void study(){
        super.study();
        System.out.println("Good");
    }
    @Override
    public void read(){
        super.read();
        System.out.println("Excellent");
    }
    @Override
    public void relax(){
        super.relax();
        System.out.println("Bad");
    }

}
