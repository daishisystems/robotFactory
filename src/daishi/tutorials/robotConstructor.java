package daishi.tutorials;

/**
 * Created by mooneyp on 22/04/2015.
 */
public class robotConstructor {
    public void Construct(robotBuilder robotBuilder) {
        robotBuilder.buildHead();
        robotBuilder.buildTorso();
        robotBuilder.buildArms();
        robotBuilder.buildLegs();
    }
}
