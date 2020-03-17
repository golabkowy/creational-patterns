package factoryMethod;

public class ProductImplC implements Product {
    @Override
    public void someMethod() {
        System.out.println("someMethod within Product C");
    }

    @Override
    public int someIntMethod() {
        System.out.println("someIntMethod within Product C");
        return 0;
    }
}
