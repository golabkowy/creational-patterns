package abstractFactory.products.implementations.brakes;

import abstractFactory.products.Brakes;

public class YamahaBrakes implements Brakes {
    @Override
    public String displayPartBrandAndName() {
        return "HONDA BRAKES";
    }
}
