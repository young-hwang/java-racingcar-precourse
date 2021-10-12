package racinggame;

public class Car {
    private final int FORWARD;
    private final int STOP;

    {
        STOP = 3;
        FORWARD = 4;
    }

    private final String name;
    private int distance;

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
}
