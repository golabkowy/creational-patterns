package abstractFactory.products.implementations.frame;

import abstractFactory.products.Frame;

public class SuzukiFrame implements Frame {
    @Override
    public String displayPartBrandAndName() {
        return "SUZUKI - FRAME";
    }
}
