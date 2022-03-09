package com.jonkim.concrete_parent_children;

public class Trainee extends Employee{
    private int numberOfYearsToTrain;

    public Trainee(String name) {
        super(name);
    }

    @Override
    public void calc() {

    }

    public String getTraineeInfo(){
        return "numberOfYearsToTrain" ;
    }

    public int getNumberOfYearsToTrain() {
        return numberOfYearsToTrain;
    }

    public void setNumberOfYearsToTrain(int numberOfYearsToTrain) {
        this.numberOfYearsToTrain = numberOfYearsToTrain;
    }
}
