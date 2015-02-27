package daishi.tutorials;

public class armouryTransportMechanism extends transportMechanism<armoury, weapon> {

    protected armouryTransportMechanism(weapon robotPart) {
        super(robotPart);
    }

    @Override
    public armoury getFactoryRoom() {
        return new armoury();
    }
}
