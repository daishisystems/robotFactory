package daishi.tutorials;

import java.util.ArrayList;

public class robotPartSupplier extends supplier {
    public void deliverRobotParts(deliveryBay deliveryBay) {
        deliveryBay.setRobotPart(new ArrayList<robotPart>(this.getRobotParts()));
        getRobotParts().clear();
    }
}
