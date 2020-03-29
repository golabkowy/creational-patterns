package abstractFactory.products.implementations.drive;

import abstractFactory.products.Drive;

public class KawasakiDrive implements Drive {
    @Override
    public String displayPartBrandAndName() {
        return "KAWASAKI DRIVE";
    }
}
