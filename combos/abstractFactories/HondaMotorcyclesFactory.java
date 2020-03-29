package abstractFactory.abstractFactories;

public class HondaMotorcyclesFactory {
    public static Motorcycle buildMotorcycle() {
        return new Motorcycle.Builder()
                .engine()
                .frame()
                .drive()
                .suspension()
                .brakes()
                .buildMotorcycle();
    }
}
