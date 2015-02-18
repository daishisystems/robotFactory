package daishi.tutorials;

import java.util.ArrayList;
import java.util.List;

public abstract class transportMechanism<E extends factoryRoom, U extends robotPart> {

    private E _factoryRoom;

    public abstract E getFactoryRoom();

    public void enterRoom() {
        _factoryRoom = getFactoryRoom();
        _factoryRoom.addTransportationMechanism(this);
    }

    public E offLoadRobotParts(List<U> robotParts) {
        if (_factoryRoom == null) {
            enterRoom();
        }
        _factoryRoom.setRobotParts(new ArrayList<U>(robotParts));
        robotParts.clear();

        return _factoryRoom;
    }
}
