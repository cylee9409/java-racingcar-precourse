package racingcar.view;

public enum Messages {
    ASK_RACING_CAR_NAMES("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");

    private String msg;

    Messages(String message) {
        this.msg = message;
    }

    public String getMsg() {
        return this.msg;
    }
}
