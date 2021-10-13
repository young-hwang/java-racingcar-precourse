package racinggame;

import java.util.Objects;

public class Car {
    private final int FORWARD;
    private final int STOP;

    {
        STOP = 3;
        FORWARD = 4;
    }

    private String name;
    private int distance = 0;

    public Car() {

    }

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

    public RacingStatus compareDistance(Car car) {
        if (this.getDistance() > car.getDistance()) {
            return RacingStatus.WIN;
        }
        if (this.getDistance() == car.getDistance()) {
            return RacingStatus.EQUAL;
        }
        return RacingStatus.LOSE;
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
