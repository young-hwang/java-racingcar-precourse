package racinggame;

public class RacingCount {
    private final String RACING_COUNT_ERROR = "[ERROR] 숫자를 입력 하세요.";

    int count;

    public RacingCount() {

    }

    public RacingCount(String count) {
        this.count = convertNumber(count);
    }

    public int getCount() {
        return count;
    }

    private int convertNumber(String count) {
        try {
            return Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(RACING_COUNT_ERROR);
        }
    }
}
