package daishi.tutorials;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class robotPartSupplierTest {

    @Test
    public void testDeliverRobotParts() throws Exception {
        robotPartSupplier robotPartSupplier = new robotPartSupplier();
        List<robotPart> robotParts = new ArrayList<robotPart>();

        robotParts.add(new mockedRobotPart());
        robotParts.add(new mockedRobotPart());

        robotPartSupplier.setRobotPart(robotParts);

        deliveryBay mockedDeliveryBay = new mockedDeliveryBay();
        robotPartSupplier.deliverRobotParts(mockedDeliveryBay);

        assertEquals(2, mockedDeliveryBay.getRobotParts().size());
        assertEquals(0, robotPartSupplier.getRobotParts().size());
    }
}