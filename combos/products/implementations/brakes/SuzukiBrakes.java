package abstractFactory.products.implementations.brakes;

import abstractFactory.products.Brakes;

public class SuzukiBrakes implements Brakes {
    @Override
    public String displayPartBrandAndName() {
        return "SUZUKI BRAKES";
    }
}
