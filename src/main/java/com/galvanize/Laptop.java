package com.galvanize;

public class Laptop {

    enum Status {
        OFF, ON, SLEEPING
    }

    private Status status = Status.OFF;

    public boolean isOn() {
        return status != Status.OFF;
    }

    public void power() {
        switch (status) {
            case OFF:
                status = Status.ON;
                break;
            case ON:
                status = Status.OFF;
                break;
            case SLEEPING:
                status = Status.ON;
                break;
        }
    }

    public boolean isSleeping() {
        return status == Status.SLEEPING;
    }

    public void sleep() {
        status = Status.SLEEPING;
    }
}
