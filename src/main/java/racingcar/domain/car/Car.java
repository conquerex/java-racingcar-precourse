package racingcar.domain.car;

public class Car {
    private CarName carName;
    private CarPosition carPosition;

    public Car(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public CarName getCarName() {
        return carName;
    }

    public int getCountByCarPosition() {
        return carPosition.getPosition();
    }

}
