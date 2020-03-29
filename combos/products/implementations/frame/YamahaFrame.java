package abstractFactory.products.implementations.frame;

import abstractFactory.products.Frame;

public class YamahaFrame implements Frame {
    @Override
    public String displayPartBrandAndName() {
        return "YAMAHA - FRAME";
    }
}
