package abstractFactory.Factories;

import abstractFactory.productA.ProductA;
import abstractFactory.productA.ProductAImplementationY;
import abstractFactory.productB.ProductB;
import abstractFactory.productB.ProductBImplementationY;
import abstractFactory.productC.ProductC;
import abstractFactory.productC.ProductCImplementationY;

// overriding of AbstractFactory methods for specific purposes
// e.g create createOSXButton, createOSXCheckbox
public class ConcreteFactoryY extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductAImplementationY();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBImplementationY();
    }

    @Override
    public ProductC createProductC() {
        return new ProductCImplementationY();
    }
}
