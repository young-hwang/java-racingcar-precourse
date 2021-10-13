package racinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class CarNames {
    private String names;
    private List<String> carNames;

    public CarNames(String names) {
        this.names = names;
        convertCarNames();
    }

    private void convertCarNames() {
        if (names.isEmpty()) {
            throw new NoSuchElementException("[ERROR] 이름을 입력하시기 바랍니다.");
        }
        carNames = Arrays.asList(names.split("\\s*,\\s*"));
    }

    public List<String> getCarNames() {
        return this.carNames;
    }
}
