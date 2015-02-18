package daishi.tutorials;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
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

    @Test
    public void workerDronePicksUpRobotPart() {
        robotPart robotPart = new mockedRobotPart(robotPartCategory.assembly);
        workerDrone workerDrone = new mockedWorkerDrone();

        workerDrone.pickUpRobotPart(robotPart);
        assertEquals(1, workerDrone.getRobotPartCount());
    }

    @Test
    public void workerDroneOffLoadsRobotParts() {
        workerDrone workerDrone = new mockedWorkerDrone();
        robotPart robotPart = new mockedRobotPart(robotPartCategory.assembly);

        workerDrone.pickUpRobotPart(robotPart);
        factoryRoom factoryRoom = workerDrone.transportRobotParts();

        assertEquals(0, workerDrone.getRobotPartCount());
        assertEquals(1, factoryRoom.getRobotPartCount());
        assertThat(factoryRoom, instanceOf(assemblyRoom.class));

        robotPart = new mockedRobotPart(robotPartCategory.weapon);

        workerDrone.pickUpRobotPart(robotPart);
        factoryRoom = workerDrone.transportRobotParts();

        assertEquals(0, workerDrone.getRobotPartCount());
        assertEquals(1, factoryRoom.getRobotPartCount());
        assertThat(factoryRoom, instanceOf(armoury.class));
    }
}