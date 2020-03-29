package abstractFactory.products.implementations.brakes;

import abstractFactory.products.Brakes;

public class HondaBrakes implements Brakes {
    @Override
    public String displayPartBrandAndName() {
        return "HONDA BRAKES";
    }
}
