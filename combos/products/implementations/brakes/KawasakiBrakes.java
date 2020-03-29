package abstractFactory.products.implementations.brakes;

import abstractFactory.products.Brakes;

public class KawasakiBrakes implements Brakes {
    @Override
    public String displayPartBrandAndName() {
        return "KAWASAKI BRAKES";
    }
}
