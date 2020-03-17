package factoryMethod;

public class ProductImplB implements Product {
    @Override
    public void someMethod() {
        System.out.println("someMethod within Product B");
    }

    @Override
    public int someIntMethod() {
        System.out.println("someIntMethod within Product B");
        return 0;
    }
}
