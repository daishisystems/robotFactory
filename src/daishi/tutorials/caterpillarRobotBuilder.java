package daishi.tutorials;

/**
 * Created by mooneyp on 21/04/2015.
 */
public class caterpillarRobotBuilder extends robotBuilder {
    public caterpillarRobotBuilder() {
        robot = new caterpillarRobot();
    }

    @Override
    public void buildHead() {
        robot.setHead(new basicHead());
    }

    @Override
    public void buildTorso() {
        robot.setTorso(new basicTorso());
    }

    @Override
    public void buildArms() {
        robot.setLeftArm(new basicLeftArm());
        robot.setRightArm(new basicRightArm());
    }

    @Override
    public void buildLegs() {
        robot.setLeftLeg(new caterpillar());
        robot.setRightLeg(new caterpillar());
    }
}
