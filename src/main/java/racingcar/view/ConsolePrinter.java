package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class ConsolePrinter {
    private static final String GAME_RESULT_PRINT_FORMAT = "%s : %s";

    public static void printConsoleMsg(Messages msg) {
        System.out.println(msg.getMsg());
    }

    public static void printRacingResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(String.format(GAME_RESULT_PRINT_FORMAT, car.getName(), car.getCarPositionByStr()));
        }
        System.out.println();
    }
}
