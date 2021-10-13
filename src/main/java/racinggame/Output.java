package racinggame;

public class Output {
    private static final String INPUT_RACING_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분";
    private static final String INPUT_RACING_COUNT = "시도할 회수는 몇회인가요?";

    public static void printInputCarNames() {
        System.out.println(Output.INPUT_RACING_CAR_NAMES);
    }

    public static void printInputRacingCount() {
        System.out.println(Output.INPUT_RACING_COUNT);
    }

    public static void showDistance(Car car) {
        System.out.println(car.getName() + " : " + Output.drawLine(car));
    }

    public static String drawLine(Car car) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < car.getDistance(); i++) {
            line.append("-");
        }
        return line.toString();
    }
}
