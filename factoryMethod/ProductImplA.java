package factoryMethod;

public class ProductImplA implements Product{
    @Override
    public void someMethod() {
        System.out.println("someMethod within Product A");
    }

    @Override
    public int someIntMethod() {
        System.out.println("someIntMethod within Product A");
        return 0;
    }
}
