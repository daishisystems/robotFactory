package daishi.tutorials;

/**
 * Created by mooneyp on 15/04/2015.
 */
public class basicRobotBuilder extends robotBuilder {

    public basicRobotBuilder() {
        robot = new basicRobot();
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
        robot.setLeftLeg(new basicLeftLeg());
        robot.setRightLeg(new basicRightLeg());
    }
}
