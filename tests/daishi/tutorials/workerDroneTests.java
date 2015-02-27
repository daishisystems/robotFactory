package daishi.tutorials;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class workerDroneTests {
    @Test
    public void workerDroneIdentifiesRobotPart() {
        robotPart robotPart = new mockedAssembly();
        workerDrone workerDrone = new mockedWorkerDrone();

        assertThat(workerDrone.identifyRobotPart(robotPart), instanceOf(assemblyRoomTransportMechanism.class));
        robotPart = new mockedWeapon();

        workerDrone.identifyRobotPart(robotPart);
        assertThat(workerDrone.identifyRobotPart(robotPart), instanceOf(armouryTransportMechanism.class));
    }

    @Test
    public void workerDronePicksUpRobotPart() {
        robotPart robotPart = new mockedAssembly();
        workerDrone workerDrone = new mockedWorkerDrone();

        workerDrone.pickUpRobotPart(robotPart);
        assertEquals(1, workerDrone.getRobotPartCount());
    }

    @Test
    public void workerDroneOffLoadsRobotParts() {
        workerDrone workerDrone = new mockedWorkerDrone();
        robotPart robotPart = new mockedAssembly();

        workerDrone.pickUpRobotPart(robotPart);
        factoryRoom factoryRoom = workerDrone.transportRobotParts();

        assertEquals(0, workerDrone.getRobotPartCount());
        assertEquals(1, factoryRoom.getRobotPartCount());
        assertThat(factoryRoom, instanceOf(assemblyRoom.class));

        robotPart = new mockedWeapon();

        workerDrone.pickUpRobotPart(robotPart);
        factoryRoom = workerDrone.transportRobotParts();

        assertEquals(0, workerDrone.getRobotPartCount());
        assertEquals(1, factoryRoom.getRobotPartCount());
        assertThat(factoryRoom, instanceOf(armoury.class));
    }

    @Test
    public void workerDroneDeliversMultipleRobotParts() {
        workerDrone workerDrone = new mockedWorkerDrone();

        robotPart randomAssembly = new mockedAssembly();
        robotPart randomWeapon = new mockedWeapon();

        workerDrone.pickUpRobotPart(randomAssembly);
        workerDrone.pickUpRobotPart(randomWeapon);

        factoryRoom factoryRoom = workerDrone.transportRobotParts();
        assertEquals(1, factoryRoom.getRobotPartCount());
    }
}