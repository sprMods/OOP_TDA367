package com.traininapp.Model;

/**
 * Class CardioExercise is a class for cardio exercises.
 */
public class CardioExercise extends Exercise{
    private double runningTime;
    private double distance;

    public CardioExercise(String name, double runningTime, double distance) {
        super(name);
        this.runningTime = runningTime;
        this.distance = distance;
    }

    public double getRunningTime() {
        return runningTime;
    }

    public double getDistance() {
        return distance;
    }
}
