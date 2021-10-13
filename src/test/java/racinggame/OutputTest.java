package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputTest {
    @DisplayName("자동차 이동 거리 표시")
    @Test
    public void 자동차_이동_거리_표시() {
        PrintStream mockedPrintStream = Mockito.mock(PrintStream.class);
        PrintStream old = System.out;
        System.setOut(mockedPrintStream);

        Car car = new Car("pobi");
        car.setDistance(3);
        Output.printOutputDistance(car);

        Mockito.verify(mockedPrintStream).println("pobi : ---");
    }

    @DisplayName("자동차 라인 그리기")
    @Test
    public void 자동차_라인_그리기() {
        Car car = new Car("pobi");
        car.setDistance(3);

        assertThat(Output.drawLine(car)).isEqualTo("---");
    }
}
