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

        robotParts.add(new mockedAssembly());
        robotParts.add(new mockedWeapon());

        robotPartSupplier.setRobotParts(robotParts);

        factoryRoom mockedDeliveryBay = new mockedDeliveryBay();
        robotPartSupplier.deliverRobotParts(mockedDeliveryBay);

        assertEquals(2, mockedDeliveryBay.getRobotPartCount());
        assertEquals(0, robotPartSupplier.getRobotParts().size());
    }
}