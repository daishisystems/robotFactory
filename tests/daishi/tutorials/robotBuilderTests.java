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

    @Test
    public void robotBuilderBuildsRobotWithCaterpillars() {
        caterpillarRobotBuilder caterpillarRobotBuilder = new caterpillarRobotBuilder();
        caterpillarRobotBuilder.buildHead();
        caterpillarRobotBuilder.buildTorso();
        caterpillarRobotBuilder.buildArms();
        caterpillarRobotBuilder.buildLegs();

        assertThat(caterpillarRobotBuilder.getRobot().getHead(), instanceOf(basicHead.class));
        assertThat(caterpillarRobotBuilder.getRobot().getTorso(), instanceOf(basicTorso.class));
        assertThat(caterpillarRobotBuilder.getRobot().getLeftArm(), instanceOf(basicLeftArm.class));
        assertThat(caterpillarRobotBuilder.getRobot().getRightArm(), instanceOf(basicRightArm.class));
        assertThat(caterpillarRobotBuilder.getRobot().getleftLeg(), instanceOf(caterpillar.class));
        assertThat(caterpillarRobotBuilder.getRobot().getRightLeg(), instanceOf(caterpillar.class));
    }
}