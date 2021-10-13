package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNamesTest {
    @DisplayName("자동차 이름 리스트 변환 처리")
    @Test
    public void 자동차_이름_리스트_변환_처리() {
        CarNames carNames = new CarNames("pobi, ppororo, edi");
        assertThat(carNames.getCarNames()).contains("pobi", "ppororo", "edi");
    }
}
