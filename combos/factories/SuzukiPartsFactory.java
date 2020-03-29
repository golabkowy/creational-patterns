package abstractFactory.factories;

import abstractFactory.products.*;

public class SuzukiPartsFactory extends PartsFactory {
    @Override
    public Part createEngine(Engine engine) {
        return null;
    }

    @Override
    public Part createFrame(Frame frame) {
        return null;
    }

    @Override
    public Part createSuspension(Suspension suspension) {
        return null;
    }

    @Override
    public Part createDrive(Drive drive) {
        return null;
    }

    @Override
    public Part createBrakes(Brakes brakes) {
        return null;
    }
}
