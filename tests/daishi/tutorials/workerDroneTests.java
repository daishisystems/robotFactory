package daishi.tutorials;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

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
        workerDrone.transportRobotParts();

        assertEquals(1, workerDrone.getRobotPartCount());
        robotPart = new mockedWeapon();

        workerDrone.pickUpRobotPart(robotPart);
        workerDrone.transportRobotParts();

        assertEquals(1, workerDrone.getRobotPartCount());
    }

    @Test
    public void workerDroneDeliversMultipleRobotParts() {
        workerDrone workerDrone = new mockedWorkerDrone();

        robotPart randomAssembly = new mockedAssembly();
        robotPart randomWeapon = new mockedWeapon();

        workerDrone.pickUpRobotPart(randomAssembly);
        workerDrone.pickUpRobotPart(randomWeapon);

        workerDrone.transportRobotParts();
        assertEquals(1, workerDrone.getRobotPartCount());
    }

    @Test
    public void workerDroneReturnsToDeliveryBayAfterDeliveringRobotParts() {
        workerDrone workerDrone = new mockedWorkerDrone();

        robotPart randomAssembly = new mockedAssembly();
        robotPart randomWeapon = new mockedWeapon();

        workerDrone.pickUpRobotPart(randomAssembly);
        workerDrone.pickUpRobotPart(randomWeapon);

        workerDrone.transportRobotParts();

        Iterator<transportMechanism> iterator = workerDrone.getTransportMechanisms().iterator();
        assertTrue(iterator.hasNext());

        transportMechanism transportMechanism = iterator.next();
        assertThat(transportMechanism, instanceOf(deliveryBayTransportMechanism.class));
    }
}