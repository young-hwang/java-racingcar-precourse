package racinggame;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class RaceCarsTest {
    RaceCars raceCars;

    @BeforeEach
    public void setUp() {
        raceCars = new RaceCars();
    }

    @DisplayName("레이싱 참가 차량 생성")
    @Test
    public void 레이싱_참가_차량_생성() {
        Car car = raceCars.createCar("pobi");
        assertThat(car).isEqualTo(new Car("pobi"));
    }

    @DisplayName("레이싱 참가 차량 초대")
    @Test
    public void 레이싱_참가_차량_초대() {
        CarNames carNames = new CarNames("pobi, ppororo, edi");
        raceCars.inviteCars(carNames);
        assertThat(raceCars.getCars())
                .contains(new Car("pobi"), new Car("ppororo"), new Car("edi"));
    }
    
    @DisplayName("참가 차량 첫 번째 진행")
    @Test
    public void 참가_차량_첫_번째_진행() {
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms.when(() -> Randoms.pickNumberInRange(0, 9))
                    .thenReturn(4, 6, 2);

            CarNames carNames = new CarNames("pobi, ppororo, edi");
            raceCars.inviteCars(carNames);
            raceCars.run();
            List cars = raceCars.getCars();
            assertThat(((Car)cars.get(0)).getDistance()).isEqualTo(1);
            assertThat(((Car)cars.get(1)).getDistance()).isEqualTo(1);
            assertThat(((Car)cars.get(2)).getDistance()).isEqualTo(0);
        }
    }

    @DisplayName("우승자 정보 확인")
    @Test
    public void 우승자_정보_확인() {
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms.when(() -> Randoms.pickNumberInRange(0, 9))
                    .thenReturn(6, 4, 2, 2, 4, 0);

            CarNames carNames = new CarNames("pobi, ppororo, edi");
            raceCars.inviteCars(carNames);
            // 2회 가동
            raceCars.run();
            raceCars.run();
            assertThat(raceCars.getWinner().get(0).getName()).isEqualTo("ppororo");
        }
    }
}
