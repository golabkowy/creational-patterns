package abstractFactory.products.implementations.drive;

import abstractFactory.products.Drive;

public class SuzukiDrive implements Drive {
    @Override
    public String displayPartBrandAndName() {
        return "SUZUKI DRIVE";
    }
}
