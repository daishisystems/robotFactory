package daishi.tutorials;

import java.util.List;

public abstract class supplier {
    private List<robotPart> _robotParts;

    public List<robotPart> getRobotParts() {
        return _robotParts;
    }

    public void setRobotParts(List<robotPart> value) {
        _robotParts = value;
    }
}
