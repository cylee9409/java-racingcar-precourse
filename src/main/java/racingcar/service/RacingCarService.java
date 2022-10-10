package racingcar.service;

import racingcar.domain.Cars;
import racingcar.view.ConsolePrinter;
import racingcar.view.ConsoleScanner;
import racingcar.view.Messages;

import java.util.List;

public class RacingCarService {
    private Cars cars = new Cars();

    public void gameStart() {
        enrollRacing();
    }

    private List<String> getCarNames() {
        ConsolePrinter.printConsoleMsg(Messages.ASK_RACING_CAR_NAMES);
        List<String> carNames = ConsoleScanner.getCarNames();
        return carNames;
    }

    private void enrollRacing() {
        List<String> carNames = getCarNames();
        try {
            cars.enrollRacing(carNames);
        } catch (IllegalArgumentException e) {
            enrollRacing();
            return;
        }
    }

}
