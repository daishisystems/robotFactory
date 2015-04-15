package daishi.tutorials;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by mooneyp on 15/04/2015.
 */
public class robotBuilderTests {
    @Test
    public void robotBuilderBuildsBasicRobot() {
        basicRobotBuilder basicRobotBuilder = new basicRobotBuilder();
        basicRobotBuilder.buildHead();
        basicRobotBuilder.buildTorso();
        basicRobotBuilder.buildArms();
        basicRobotBuilder.buildLegs();

        assertThat(basicRobotBuilder.getRobot().getHead(), instanceOf(basicHead.class));
        assertThat(basicRobotBuilder.getRobot().getTorso(), instanceOf(basicTorso.class));
        assertThat(basicRobotBuilder.getRobot().getLeftArm(), instanceOf(basicLeftArm.class));
        assertThat(basicRobotBuilder.getRobot().getRightArm(), instanceOf(basicRightArm.class));
        assertThat(basicRobotBuilder.getRobot().getleftLeg(), instanceOf(basicLeftLeg.class));
        assertThat(basicRobotBuilder.getRobot().getRightLeg(), instanceOf(basicRightLeg.class));
    }
}
