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

    public CarPosition getCarPosition() {
        return carPosition;
    }

    public void setCarName(CarName carName) {
        this.carName = carName;
    }

    public void setCarPosition(CarPosition carPosition) {
        this.carPosition = carPosition;
    }
}
