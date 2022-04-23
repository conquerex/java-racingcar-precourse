package racingcar.domain;

import racingcar.domain.car.Car;

import java.util.List;

public class RacingCars {

    private List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
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
