package racinggame;

import java.util.Objects;

public class Car {
    private final int FORWARD;
    private final int STOP;

    {
        STOP = 3;
        FORWARD = 4;
    }

    private final String name;
    private int distance = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistance(int distances) {
        this.distance = distances;
    }

    public int getDistance() {
        return distance;
    }

    public void running(int num) {
        if (num <= STOP) {
            return;
        }
        this.distance++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distance == car.distance && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distance);
    }
}
