package abstractFactory.Factories;

import abstractFactory.productA.ProductA;
import abstractFactory.productA.ProductAImplementationX;
import abstractFactory.productB.ProductB;
import abstractFactory.productB.ProductBImplementationX;
import abstractFactory.productC.ProductC;
import abstractFactory.productC.ProductCImplementationX;

// overriding of AbstractFactory methods for specific purposes
// e.g create createWindowsButton, createWindowsCheckbox
public class ConcreteFactoryX extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductAImplementationX();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBImplementationX();
    }

    @Override
    public ProductC createProductC() {
        return new ProductCImplementationX();
    }
}
