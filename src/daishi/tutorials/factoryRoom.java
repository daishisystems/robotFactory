package daishi.tutorials;

import java.util.ArrayList;
import java.util.List;

public abstract class factoryRoom<E extends robotPart> {
    private List<transportMechanism> _transportMechanisms = new ArrayList<transportMechanism>();
    private List<E> _robotParts;

    public void addTransportationMechanism(transportMechanism transportMechanism) {
        _transportMechanisms.add(transportMechanism);
    }

    public void setRobotParts(List<E> robotParts) {
        _robotParts = robotParts;
    }

    public int getOccupantCount() {
        return _transportMechanisms != null ? _transportMechanisms.size() : 0;
    }

    public int getRobotPartCount() {
        return _robotParts != null ? _robotParts.size() : 0;
    }
}