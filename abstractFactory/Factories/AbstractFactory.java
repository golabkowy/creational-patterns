package abstractFactory.Factories;

import abstractFactory.productA.ProductA;
import abstractFactory.productB.ProductB;
import abstractFactory.productC.ProductC;

// Abstract class or interface - generally contract that tells about "generic" typew which can be created by concrete factories
// e.g methods for UI elements creating createButton, createCheckbox etc.
public abstract class AbstractFactory {
    public abstract ProductA createProductA();

    public abstract ProductB createProductB();

    public abstract ProductC createProductC();
}
