package com.vrbprog;

public class Car {
    private String tradeMark;
    private boolean isStarting;
    private boolean isMoving;
    private int speed;

    public Car(String name) {
        tradeMark = name;
        isStarting = false;
        isMoving = false;
        speed = 0;
    }

    public void startEngine() {
        isStarting = true;
    }

    public void stopEngine() {
        isStarting = false;
    }


    public void move() {
        isMoving = true;
    }

    public void stop() {
        isMoving = false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car " + tradeMark + (isStarting ? " is starting, " : " isn't starting, ")
                + (isMoving ? "is moving, " : "isn't moving, ")
                + "speed is " + speed + " km/h";
    }
}
