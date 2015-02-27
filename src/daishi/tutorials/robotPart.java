package daishi.tutorials;

public abstract class robotPart {
    protected robotPartCategory robotPartCategory;
    protected String name;

    public robotPartCategory getRobotPartCategory() {
        return robotPartCategory;
    }

    public String getName() {
        return name != null ? name : "Robot Part X";
    }

    public void setName(String name) {
        this.name = name;
    }

    protected robotPart(robotPartCategory robotPartCategory) {
        this.robotPartCategory = robotPartCategory;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (!(obj instanceof robotPart)) {
            return false;
        } else {
            return ((robotPart) obj).getName() == this.getName();
        }
    }
}
