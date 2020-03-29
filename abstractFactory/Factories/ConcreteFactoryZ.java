package abstractFactory.Factories;

import abstractFactory.productA.ProductA;
import abstractFactory.productA.ProductAImplementationZ;
import abstractFactory.productB.ProductB;
import abstractFactory.productB.ProductBImplementationZ;
import abstractFactory.productC.ProductC;
import abstractFactory.productC.ProductCImplementationZ;

// overriding of AbstractFactory methods for specific purposes
// e.g create createLinuxButton, createLinuxCheckbox
public class ConcreteFactoryZ extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductAImplementationZ();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBImplementationZ();
    }

    @Override
    public ProductC createProductC() {
        return new ProductCImplementationZ();
    }
}
