package daishi.tutorials;

public class deliveryBayTransportMechanism extends transportMechanism<factoryRoom, robotPart> {

    protected deliveryBayTransportMechanism(robotPart robotPart) {
        super(robotPart);
    }

    @Override
    public factoryRoom getFactoryRoom() {
        return new deliveryBay();
    }
}