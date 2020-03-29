package abstractFactory;

import abstractFactory.abstractFactories.*;
import abstractFactory.enums.MotorcycleBrand;

public class MotorcyclesDealer {
    public static Motorcycle completeOrder(MotorcycleBrand motorcycleBrand) {
        switch (motorcycleBrand) {
            case HONDA:
                return HondaMotorcyclesFactory.buildMotorcycle();
            case YAMAHA:
                return YamahaMotorcyclesFactory.buildMotorcycle();
            case KAWASAKI:
                return KawasakiMotorcyclesFactory.buildMotorcycle();
            case SUZUKI:
                return SuzukiMotorcyclesFactory.buildMotorcycle();
            default:
                return null;
        }

    }
}
