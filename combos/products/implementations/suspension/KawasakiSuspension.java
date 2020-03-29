package abstractFactory.products.implementations.suspension;

import abstractFactory.products.Suspension;

public class KawasakiSuspension implements Suspension {
    @Override
    public String displayPartBrandAndName() {
        return "KAWASAKI SUSPENSION";
    }
}
