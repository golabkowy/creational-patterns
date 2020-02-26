package prototype.gangOfFourApproach;

public class ConcretePrototypeB extends Prototype<ConcretePrototypeB> {
    private int foo;
    private String bar;

    public ConcretePrototypeB(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public ConcretePrototypeB(ConcretePrototypeB concretePrototypeB) {
        this.foo = concretePrototypeB.foo;
        this.bar = concretePrototypeB.bar;
    }

    @Override
    protected ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this);
    }
}
