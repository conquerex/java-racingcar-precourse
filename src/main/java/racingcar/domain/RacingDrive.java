package racingcar.domain;

public class RacingDrive {
    private boolean isDrive;

    public RacingDrive(boolean isDrive) {
        this.isDrive = isDrive;
    }

    public boolean isDrive() {
        return isDrive;
    }

    public void setDrive(int num) {
        if (num >= 4) isDrive = true;
        if (num < 4) isDrive = false;
    }
}
