package daishi.tutorials;

public class deliveryBayTransportMechanism extends transportMechanism<factoryRoom, robotPart> {

    protected deliveryBayTransportMechanism() {
        super(null);
    }

    @Override
    public factoryRoom getFactoryRoom() {
        return new deliveryBay();
    }
}