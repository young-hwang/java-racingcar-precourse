package racinggame;

import java.util.ArrayList;
import java.util.List;

public class RaceCars {
    private List<Car> cars;

    public void inviteCars(String s) {
        cars = new ArrayList<>();
        cars.add(new Car("pobi"));
        cars.add(new Car("ppororo"));
        cars.add(new Car("edi"));
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public Car createCar(String name) {
        return new Car(name);
    }
}
