package com.traininapp.Model;

/**
 * Class Exercise, parent class for  different types of exercises.
 */
public class Exercise {
    private String name;

    public Exercise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
