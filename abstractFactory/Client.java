package abstractFactory;

import abstractFactory.Factories.AbstractFactory;
import abstractFactory.enums.ProductTypes;

// User imports only AbstractFactory
public class Client {
    public static void main(String[] args) {
        // e.g usage
        AbstractFactory lol = new BunchOfMethods(ProductTypes.PRODUCT_X).abstractFactory;

        System.out.println(lol.createProductA().getName());
        System.out.println(lol.createProductB().getName());
        System.out.println(lol.createProductC().getName());

        // it will print AX / BX / CX
    }
}
