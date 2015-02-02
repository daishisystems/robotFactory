package daishi.tutorials;

import java.util.List;

public abstract class deliveryBay {
    private List<robotPart> _robotParts;

    public List<robotPart> getRobotParts() {
        return _robotParts;
    }

    public void setRobotPart(List<robotPart> value) {
        _robotParts = value;
    }
} // todo: Abstract deliveryBay and supplier to the same interface
