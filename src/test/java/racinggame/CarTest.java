package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {
    private Car car;

    @BeforeEach
    public void setup() {
        car = new Car("pobi");
    }

    @DisplayName("자동차 이름 입력 확인")
    @Test
    public void 자동차_이름_입력_확인() {
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @DisplayName("자동차 위치 확인")
    @Test
    public void 자동차_위치_확인() {
        car.setDistance(3);
        assertThat(car.getDistance()).isEqualTo(3);
    }

    @DisplayName("자동차 전진 테스트")
    @Test
    public void 자동차_전진_테스트() {
        car.running(4);
        assertThat(car.getDistance()).isEqualTo(1);
        car.running(9);
        assertThat(car.getDistance()).isEqualTo(2);
    }

    @DisplayName("자동차 전진 후 정지 테스트")
    @Test
    public void 자동차_전진_후_정지_테스트() {
        car.running(4);
        car.running(3);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @DisplayName("자동차 거리 비교 승리 테스트")
    @Test
    public void 자동차_거리_비교_승리_테스트() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("ppororo");

        car1.setDistance(3);
        car2.setDistance(2);
        assertThat(car1.compareDistance(car2)).isEqualTo(RacingStatus.WIN);
    }

    @DisplayName("자동차 거리 비교 동등 테스트")
    @Test
    public void 자동차_거리_비교_동등_테스트() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("ppororo");

        car1.setDistance(2);
        car2.setDistance(2);
        assertThat(car1.compareDistance(car2)).isEqualTo(RacingStatus.EQUAL);
    }

    @DisplayName("자동차 거리 비교 패배 테스트")
    @Test
    public void 자동차_거리_비교_패배_테스트() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("ppororo");

        car1.setDistance(2);
        car2.setDistance(3);
        assertThat(car1.compareDistance(car2)).isEqualTo(RacingStatus.LOSE);
    }
}
