package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceCarsTest {
    List<Car> cars = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        cars.add(new Car("pobi"));
        cars.add(new Car("pporo"));
        cars.add(new Car("edi"));
    }

    @DisplayName("레이싱 참가 차량 생성")
    @Test
    public void 레이싱_참가_차량_생성() {
        RaceCars raceCars = new RaceCars();
        Car car = raceCars.createCar("pobi");
        assertThat(car).isEqualTo(new Car("pobi"));
    }

    @DisplayName("레이싱 참가 차량 초대")
    @Test
    public void 레이싱_참가_차량_초대() {
        RaceCars raceCars = new RaceCars();
        raceCars.inviteCars("pobi,pporo,edi");
        assertThat(raceCars.getCars())
                .contains(new Car("pobi"), new Car("ppororo"), new Car("edi"));
    }
}
