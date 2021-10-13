package racinggame;

import nextstep.utils.Console;

public class RacingGame {
    private int racingCount = 0;
    private RaceCars raceCars = new RaceCars();

    public void play() {
        try {
            inputCarNames();
            inputRacingCount();

            for (int i = 0; i < racingCount; i++) {
                raceCars.run();
                outputDinstance();
            }

            outputWinners();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private void outputDinstance() {
        raceCars.getCars().forEach(car -> Output.printOutputDistance(car));
        System.out.println();
    }

    private void outputWinners() {
        Output.printOutputWinner(raceCars.getWinner().toString()
                .replace("[", "")
                .replace("]", ""));
    }

    private void inputRacingCount() {
        Output.printInputRacingCount();
        racingCount = (new RacingCount(Console.readLine())).getCount();
    }

    private void inputCarNames() {
        Output.printInputCarNames();
        raceCars.inviteCars(new CarNames(Console.readLine()));
    }
}
