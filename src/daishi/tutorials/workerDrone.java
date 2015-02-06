package daishi.tutorials;

public class workerDrone {
    private transportMechanism _transportMechanism;

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
}