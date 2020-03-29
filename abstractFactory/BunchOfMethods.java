package abstractFactory;

import abstractFactory.Factories.AbstractFactory;
import abstractFactory.Factories.ConcreteFactoryX;
import abstractFactory.Factories.ConcreteFactoryY;
import abstractFactory.Factories.ConcreteFactoryZ;
import abstractFactory.enums.ProductTypes;

// Abstract Factory Broker. It helps to keep clean code.
public class BunchOfMethods {

    public AbstractFactory abstractFactory;

    public BunchOfMethods(ProductTypes productTypes) {
        switch (productTypes) {
            case PRODUCT_X:
                abstractFactory = new ConcreteFactoryX();
                break;
            case PRODUCT_Y:
                abstractFactory = new ConcreteFactoryY();
                break;
            case PRODUCT_Z:
                abstractFactory = new ConcreteFactoryZ();
                break;
        }
    }
}
