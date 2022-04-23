package racingcar.domain.car;

public class CarName {
    private String name;

    public CarName(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("Car name is too long");
        }
    }
}
