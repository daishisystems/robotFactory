package daishi.tutorials;

public abstract class robotPart {
    protected robotPartCategory robotPartCategory;

    public robotPartCategory getRobotPartCategory() {
        return robotPartCategory;
    }

    protected robotPart(robotPartCategory robotPartCategory) {
        this.robotPartCategory = robotPartCategory;
    }
}
