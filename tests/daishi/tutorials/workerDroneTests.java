package daishi.tutorials;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class workerDroneTests {
    @Test
    public void workerDroneIdentifiesRobotPart() {
        robotPart robotPart = new mockedRobotPart(robotPartCategory.assembly);
        workerDrone workerDrone = new mockedWorkerDrone();

        workerDrone.identifyRobotPart(robotPart);
        assertThat(workerDrone.getTransportMechanism(), instanceOf(assemblyRoomTransportMechanism.class));

        robotPart = new mockedRobotPart(robotPartCategory.weapon);

        workerDrone.identifyRobotPart(robotPart);
        assertThat(workerDrone.getTransportMechanism(), instanceOf(armouryTransportMechanism.class));
    }
}
