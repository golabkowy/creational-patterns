package abstractFactory.products.implementations.suspension;

import abstractFactory.products.Suspension;

public class YamahaSuspension implements Suspension {
    @Override
    public String displayPartBrandAndName() {
        return "YAMAHA SUSPENSION";
    }
}
