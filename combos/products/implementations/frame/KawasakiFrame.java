package abstractFactory.products.implementations.frame;

import abstractFactory.products.Frame;

public class KawasakiFrame implements Frame {
    @Override
    public String displayPartBrandAndName() {
        return "KAWASAKI - FRAME";
    }
}
