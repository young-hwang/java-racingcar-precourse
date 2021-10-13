package racinggame;

import nextstep.utils.Randoms;

import java.util.*;

public class RaceCars {
    private final int MIN_NUMBER;
    private final int MAX_NUMBER;

    {
        MIN_NUMBER = 0;
        MAX_NUMBER = 9;
    }

    private List<Car> cars;

    public void inviteCars(CarNames carNames) {
        this.cars = new ArrayList<>();
        carNames.getCarNames().forEach(name -> this.cars.add(new Car(name)));
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public Car createCar(String name) {
        return new Car(name);
    }

    public void run() {
        cars.forEach(car -> car.running(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER)));
    }

    public List<Car> getWinner() {
        List<Car> winners = new ArrayList<>();
        winners.add(new Car());

        for (Car car : this.cars) {
            addWinners(winners, car);
        }
        return winners;
    }

    private void addWinners(List<Car> winners, Car car) {
        RacingStatus status = car.compareDistance(winners.get(0));
        if (status == RacingStatus.WIN) {
            winners.clear();
            winners.add(car);
        }
        if (status == RacingStatus.EQUAL) {
            winners.add(car);
        }
    }
}

