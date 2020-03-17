package factoryMethod;

public class Factory {
    public Product getProduct(ProductType productType) {
        switch (productType) {
            case PRODUCT_A:
                return new ProductImplA();
            case PRODUCT_B:
                return new ProductImplB();
            case PRODUCT_C:
                return new ProductImplC();
            default:
                return null;
        }
    }
}
