package prototype.gangOfFourApproach;

public class Client {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA(1, "wombat");
        ConcretePrototypeA concretePrototypeA1 = concretePrototypeA.clone();

        ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB (1, "wombat");
        ConcretePrototypeB concretePrototypeB1 = concretePrototypeB.clone();
    }
}
