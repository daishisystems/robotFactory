package daishi.tutorials;

import java.util.ArrayList;
import java.util.List;

public abstract class factoryRoom<E extends robotPart> {
    private List<transportMechanism> _transportMechanisms = new ArrayList<transportMechanism>();
    private List<E> _robotParts;

    protected factoryRoom() {
        _robotParts = new ArrayList<E>();
    }

    public void addTransportationMechanism(transportMechanism transportMechanism) {
        _transportMechanisms.add(transportMechanism);
    }

    public void addRobotPart(E robotPart) {
        _robotParts.add(robotPart);
    }

    public int getRobotPartCount() {
        return _robotParts != null ? _robotParts.size() : 0;
    }
}