package racinggame;

public class Car {
    private final int FORWARD;
    private final int STOP;

    {
        STOP = 3;
        FORWARD = 4;
    }

    private final String name;
    private int location;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void running(int num) {
        if (num <= STOP) {
            return;
        }
        this.location++;
    }
}
