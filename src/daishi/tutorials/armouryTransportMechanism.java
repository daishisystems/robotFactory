package daishi.tutorials;

public class armouryTransportMechanism extends transportMechanism<armoury, weapon> {

    @Override
    public armoury getFactoryRoom() {
        return new armoury();
    }
}
