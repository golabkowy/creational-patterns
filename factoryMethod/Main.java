package factoryMethod;

// Loose coupling.
// Only one import statement.
// Possibility to create infinite number of objects by passing appropriate parameter.

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Product productA = factory.getProduct(ProductType.PRODUCT_A);
        productA.someMethod();
        productA.someIntMethod();

        Product productB = factory.getProduct(ProductType.PRODUCT_B);
        productB.someMethod();
        productB.someIntMethod();

        Product productC = factory.getProduct(ProductType.PRODUCT_C);
        productC.someMethod();
        productC.someIntMethod();
    }
}
