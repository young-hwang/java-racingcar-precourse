package racinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNames {
    private String names;
    private List<String> carNames;

    public CarNames(String names) {
        this.names = names;
        converCarNames();
    }

    private void converCarNames() {
        carNames = Arrays.asList(names.split("\\s*,\\s*"));
    }

    public List<String> getCarNames() {
        return this.carNames;
    }
}
