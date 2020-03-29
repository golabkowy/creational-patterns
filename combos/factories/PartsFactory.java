package abstractFactory.factories;

import abstractFactory.products.*;

public abstract class PartsFactory {
    //zobaczyc czemu nie lepiej dawać wspolny interface czyli tutaj akurat Parts
    public abstract Part createEngine(Engine engine);

    public abstract Part createFrame(Frame frame);

    public abstract Part createSuspension(Suspension suspension);

    public abstract Part createDrive(Drive drive);

    public abstract Part createBrakes(Brakes brakes);
}
