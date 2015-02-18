package daishi.tutorials;

public class assemblyRoomTransportMechanism extends transportMechanism<assemblyRoom, assembly> {

    @Override
    public assemblyRoom getFactoryRoom() {
        return new assemblyRoom();
    }
}
