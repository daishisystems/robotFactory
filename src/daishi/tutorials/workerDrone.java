package daishi.tutorials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class workerDrone {

    private List<transportMechanism> _transportMechanisms;

    public workerDrone() {
        _transportMechanisms = new ArrayList<transportMechanism>();
    }

    public transportMechanism identifyRobotPart(robotPart robotPart) throws UnsupportedOperationException {
        switch (robotPart.getRobotPartCategory()) {
            case assembly:
                return new assemblyRoomTransportMechanism((assembly) robotPart);
            case weapon:
                return new armouryTransportMechanism((weapon) robotPart);
        }
        throw new UnsupportedOperationException("I can't identify this component!");
    }

    public void pickUpRobotPart(robotPart robotPart) {
        transportMechanism transportMechanism = identifyRobotPart(robotPart);
        _transportMechanisms.add(transportMechanism);
    }

    public void transportRobotParts() {
        for (Iterator<transportMechanism> i = _transportMechanisms.iterator(); i.hasNext(); ) {
            transportMechanism transportMechanism = i.next();
            transportMechanism.offLoadRobotPart();
        }

        _transportMechanisms.clear();

        deliveryBayTransportMechanism deliveryBayTransportMechanism = new deliveryBayTransportMechanism();
        _transportMechanisms.add(deliveryBayTransportMechanism);

        deliveryBayTransportMechanism.enterRoom();
    }

    public int getRobotPartCount() {
        return _transportMechanisms.size();
    }

    public List<transportMechanism> getTransportMechanisms() {
        return _transportMechanisms;
    }
}