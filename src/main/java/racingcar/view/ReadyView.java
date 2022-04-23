package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.car.CarName;

import java.util.ArrayList;
import java.util.List;

public class ReadyView {
    private static final String COMMA = ",";
    private static final String MESSAGE_INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String MESSAGE_INPUT_CAR_ROUND = "시도할 회수는 몇회인가요?";
    private static final String REG_EXP_IS_NUMBER = "^[0-9]+$";


    public List<CarName> createCarNames() {
        System.out.println(MESSAGE_INPUT_CAR_NAME);
        String nameBulk = Console.readLine();
        String[] names = nameBulk.split(COMMA);
        return generateCarNameArrayToList(names);
    }

    private List<CarName> generateCarNameArrayToList(String[] names) {
        List<CarName> carNames = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            carNames.add(new CarName(names[i]));
        }
        return carNames;
    }

    public int createRacingRound() {
        System.out.println(MESSAGE_INPUT_CAR_ROUND);
        String round = Console.readLine();
        return generateRacingRoundStringToInt(round);
    }

    public int generateRacingRoundStringToInt(String roundString) {
        validateRacingRound(roundString);
        return Integer.parseInt(roundString);
    }

    public void validateRacingRound(String roundString) {
        if (roundString == null || roundString.isEmpty()) {
            throw new IllegalArgumentException("시도할 회수를 입력하세요.");
        }

        if (!roundString.matches(REG_EXP_IS_NUMBER)) {
            throw new IllegalArgumentException("시도할 회수는 숫자로만 입력해주세요.");
        }
    }
}
