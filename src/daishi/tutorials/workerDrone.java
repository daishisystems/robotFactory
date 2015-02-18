package daishi.tutorials;

import java.util.ArrayList;
import java.util.List;

public class workerDrone {
    private transportMechanism _transportMechanism;
    private List<robotPart> _robotParts;

    public workerDrone() {
        _robotParts = new ArrayList<robotPart>();
    }

    public transportMechanism getTransportMechanism() {
        return _transportMechanism;
    }

    public void identifyRobotPart(robotPart robotPart) {
        switch (robotPart.getRobotPartCategory()) {
            case assembly:
                _transportMechanism = new assemblyRoomTransportMechanism();
                break;
            case weapon:
                _transportMechanism = new armouryTransportMechanism();
                break;
        }
    }

    public void pickUpRobotPart(robotPart robotPart) {
        this._robotParts.add(robotPart);
        identifyRobotPart(robotPart);
    }

    public factoryRoom transportRobotParts() {
        if (_transportMechanism == null) {
            throw new NullPointerException("No Transportation-Mechanism defined!");
        }
        return _transportMechanism.offLoadRobotParts(_robotParts);
    }

    public int getRobotPartCount() {
        return _robotParts.size();
    }
}