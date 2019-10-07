package com.traininapp.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Session which holds a list of exercises and a date.s
 */
public class Session {
    private String name;
    private List<Exercise> exerciseList;
    private List<ISessionObserver> sessionObservers;
    LocalDate date;
    private int sessionImage;

    /**
     * Constructor for Session which takes name of exercise and date as parameters
     * @param name Name of session
     * @param date Date of session
     */
    public Session(String name, LocalDate date) {
        this.name = name;
        this.exerciseList = new ArrayList<>();
        this.date = date;
        sessionObservers = new ArrayList<>();
    }

    /**
     * Constructor for Session which takes name, date and image as parameters
     * @param name Name of session
     * @param date Date of session
     * @param sessionImage Image of session
     */
    public Session(String name, LocalDate date, int sessionImage) {
        this.name = name;
        this.exerciseList = new ArrayList<>();
        this.date = date;
        this.sessionImage = sessionImage;
    }

    /**
     * Adds an observer to the session
     *
     * @param observer
     */
    public void addObserver(ISessionObserver observer){
        sessionObservers.add(observer);
    }

    /**
     * Removes an observer from the session
     *
     * @param observer
     */
    public void removeObservers(ISessionObserver observer){
        sessionObservers.remove(observer);
    }

    /**
     *Sends the list of exercises over to the observer
     * Call for this only once! otherwise there will be duplicate data in statistics.
     */
    private void updateSessionObserver(){
        for (ISessionObserver observer: sessionObservers){
            observer.updateSessionStats(exerciseList);
        }
    }

    /**
     * Method adds a Cardio Exercise into a Session.
     * @param name name of added exercise
     * @param runningTime time running (min)
     * @param distance distance run (m)
     */
    public void addCardioExercise(String name, double runningTime, double distance ){
        exerciseList.add(new CardioExercise(name, runningTime, distance));
    }

    /**
     * Method adds a Strength exercise into a Session.
     * @param name name of added exercise
     * @param sets number of sets
     * @param reps number of reps
     * @param weight weight used in the exercise
     */
    public void addStrengthExercise(String name, int sets, int reps, double weight ){
        exerciseList.add(new StrengthExercise(name, sets, reps, weight));
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSessionImage() {
        return sessionImage;
    }
}
