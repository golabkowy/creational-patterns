package abstractFactory.products.implementations.suspension;

import abstractFactory.products.Suspension;

public class SuzukiSuspension implements Suspension {
    @Override
    public String displayPartBrandAndName() {
        return "SUZUKI SUSPENSION";
    }
}
