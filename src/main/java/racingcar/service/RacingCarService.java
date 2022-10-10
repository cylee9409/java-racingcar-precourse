package racingcar.service;

import racingcar.view.ConsolePrinter;
import racingcar.view.ConsoleScanner;
import racingcar.view.Messages;

import java.util.List;

public class RacingCarService {
    public void gameStart() {
        getCarNames();
    }

    private List<String> getCarNames() {
        ConsolePrinter.printConsoleMsg(Messages.ASK_RACING_CAR_NAMES);
        List<String> carNames = ConsoleScanner.getCarNames();
        return carNames;
    }
    
}
