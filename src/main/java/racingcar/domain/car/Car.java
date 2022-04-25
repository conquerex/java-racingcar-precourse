package racingcar.domain.car;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int NUMBER_RANGE_MIN = 0;
    private static final int NUMBER_RANGE_MAX = 9;
    private static final int NUMBER_RANGE_STANDARD = 4;

    private CarName carName;
    private CarPosition carPosition;

    public Car(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public static Car of(CarName carName) {
        return new Car(carName, CarPosition.of(0));
    }

    public CarName getCarName() {
        return carName;
    }

    public int getCountByCarPosition() {
        return carPosition.getPosition();
    }

    public void move() {
        int number = Randoms.pickNumberInRange(NUMBER_RANGE_MIN, NUMBER_RANGE_MAX);
        if (number >= NUMBER_RANGE_STANDARD) {
            carPosition.move();
        }
    }

}
