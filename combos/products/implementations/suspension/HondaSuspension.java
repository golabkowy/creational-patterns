package abstractFactory.products.implementations.suspension;

import abstractFactory.products.Suspension;

public class HondaSuspension implements Suspension {
    @Override
    public String displayPartBrandAndName() {
        return "HONDA SUSPENSION";
    }
}
