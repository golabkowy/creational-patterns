package abstractFactory.products.implementations.drive;

import abstractFactory.products.Drive;

public class HondaDrive implements Drive {
    @Override
    public String displayPartBrandAndName() {
        return "HONDA DRIVE";
    }
}
