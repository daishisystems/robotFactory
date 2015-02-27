package daishi.tutorials;

import java.util.Iterator;

public class robotPartSupplier extends supplier {
    public void deliverRobotParts(factoryRoom<robotPart> deliveryBay) {

        for (Iterator<robotPart> i = getRobotParts().iterator(); i.hasNext(); ) {
            deliveryBay.addRobotPart(i.next());
        }

        getRobotParts().clear();
    }
}
