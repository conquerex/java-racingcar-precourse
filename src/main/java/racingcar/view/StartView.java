package racingcar.view;

import racingcar.domain.RacingCars;
import racingcar.domain.RacingGame;
import racingcar.domain.car.Car;

public class StartView {

    private static final String MESSAGE_EXCUTE_RESULT = "실행 결과\n";
    private static final String MESSAGE_COLON = " : ";
    private static final String MESSAGE_WINNER = "최종 우승자: ";


    public void showRacingGame(RacingGame racingGame) {
        System.out.println(MESSAGE_EXCUTE_RESULT);
        for (int i = 0; i < racingGame.getRacingRound(); i++) {
            showRacingRound(racingGame.getRacingCars());
            System.out.println(); // 한줄 띄움
        }
    }

    private void showRacingRound(RacingCars racingCars) {
        for (int i = 0; i < racingCars.getCarsCount(); i++) {
            String carDash = getDashByCarPosition(racingCars.getCar(i));
            System.out.println(racingCars.getCarName(i) + MESSAGE_COLON + carDash);
        }
    }

    private String getDashByCarPosition(Car car) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < car.getCountByCarPosition(); i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    private void showWinner(RacingCars winnerNameBulk) {
        System.out.println(MESSAGE_WINNER + winnerNameBulk);
    }

}
