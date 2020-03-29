package abstractFactory.products.implementations.engine;

import abstractFactory.products.Engine;

public class YamahaEngine implements Engine {
    @Override
    public String displayPartBrandAndName() {
        return "YAMAHA ENGINE";
    }
}
