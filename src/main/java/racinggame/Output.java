package racinggame;

public class Output {
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
