package racingcar.domain;

import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public static RacingCars of(List<CarName> carNames) {
        List<Car> cars = new ArrayList<>(carNames.size());
        for (CarName carName : carNames) {
            cars.add(Car.of(carName));
        }
        return new RacingCars(cars);
    }

    public int getCarsCount() {
        return cars.size();
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public String getCarName(int index) {
        return cars.get(index).getCarName().getName();
    }
}
