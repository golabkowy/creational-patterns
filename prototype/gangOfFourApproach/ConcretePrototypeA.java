package prototype.gangOfFourApproach;

public class ConcretePrototypeA extends Prototype<ConcretePrototypeA> {
    private int foo;
    private String bar;

    public ConcretePrototypeA(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public ConcretePrototypeA(ConcretePrototypeA concretePrototypeA) {
        this.foo = concretePrototypeA.foo;
        this.bar = concretePrototypeA.bar;
    }

    @Override
    protected ConcretePrototypeA clone() {
        return new ConcretePrototypeA(this);
    }
}
