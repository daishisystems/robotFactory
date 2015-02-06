package daishi.tutorials;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class robotPartSupplierTest {

    @Test
    public void supplierDeliversRobotParts() throws Exception {
        robotPartSupplier robotPartSupplier = new robotPartSupplier();
        List<robotPart> robotParts = new ArrayList<robotPart>();

        robotParts.add(new mockedRobotPart(robotPartCategory.assembly));
        robotParts.add(new mockedRobotPart(robotPartCategory.assembly));

        robotPartSupplier.setRobotPart(robotParts);

        deliveryBay mockedDeliveryBay = new mockedDeliveryBay();
        robotPartSupplier.deliverRobotParts(mockedDeliveryBay);

        assertEquals(2, mockedDeliveryBay.getRobotParts().size());
        assertEquals(0, robotPartSupplier.getRobotParts().size());
    }
}