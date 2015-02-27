package daishi.tutorials;

public class assemblyRoomTransportMechanism extends transportMechanism<assemblyRoom, assembly> {

    public assemblyRoomTransportMechanism(assembly robotPart) {
        super(robotPart);
    }

    @Override
    public assemblyRoom getFactoryRoom() {
        return new assemblyRoom();
    }
}
