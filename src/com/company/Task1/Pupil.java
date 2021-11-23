package com.company.Task1;

public class Pupil {
    protected String name;
    protected int stage;

    public Pupil(String name, int stage) {
        this.name = name;
        this.setStage(stage);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", stage=" + stage +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name = name.strip();
    }
    public int getStage() {
        return stage = (stage >= 0 && stage <= 12 ? stage : -1);
    }
    public void setStage(int stage) {
        this.stage = stage;
    }
    public void study()
    {
        System.out.print(System.lineSeparator()+"Studies ");
    }
    public void read()
    {
        System.out.print(System.lineSeparator()+"Writes ");
    }
    public void relax()
    {
        System.out.print(System.lineSeparator()+"Relax ");
    }
}
