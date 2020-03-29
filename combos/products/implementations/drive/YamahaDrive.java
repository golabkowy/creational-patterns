package abstractFactory.products.implementations.drive;

import abstractFactory.products.Drive;

public class YamahaDrive implements Drive {
    @Override
    public String displayPartBrandAndName() {
        return "YAMAHA DRIVE";
    }
}
