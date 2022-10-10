package racingcar.view;

public enum Messages {
    ASK_RACING_CAR_NAMES("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)"),
    ERROR_CAR_NAME_LEN("[ERROR] 입력된 차 이름이 다섯 자가 초과되었습니다. 다시 입력해주세요."),
    ERROR_DUPLICATE_CAR_NAME("[ERROR] 입력된 차 이름이 기존에 등록되었습니다. 다시 입력해주세요."),
    ERROR_MIN_CAR_COUNT("[ERROR] 레이싱을 위해 차는 최소 2개가 등록되어야 합니다. 다시 입력해주세요.");

    private String msg;

    Messages(String message) {
        this.msg = message;
    }

    public String getMsg() {
        return this.msg;
    }
}
