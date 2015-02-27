package daishi.tutorials;

public abstract class transportMechanism<E extends factoryRoom, U extends robotPart> {
    private final U _robotPart;
    private E _factoryRoom;

    public abstract E getFactoryRoom();

    protected transportMechanism(U robotPart) {
        _robotPart = robotPart;
    }

    public void enterRoom() {
        _factoryRoom = getFactoryRoom();
        _factoryRoom.addTransportationMechanism(this);
    }

    public E offLoadRobotPart() {
        if (_factoryRoom == null) {
            enterRoom();
        }

        _factoryRoom.addRobotPart(_robotPart);
        return _factoryRoom;
    }
}
