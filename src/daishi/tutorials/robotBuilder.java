package daishi.tutorials;

/**
 * Created by mooneyp on 15/04/2015.
 */
public abstract class robotBuilder {
    protected robot robot;

    public robot getRobot() {
        return robot;
    }

    public abstract void buildHead();

    public abstract void buildTorso();

    public abstract void buildArms();

    public abstract void buildLegs();
}
