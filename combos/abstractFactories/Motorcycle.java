package abstractFactory.abstractFactories;

import abstractFactory.products.*;

public class Motorcycle {
    private final Engine engine;
    private final Frame frame;
    private final Drive drive;
    private final Suspension suspension;
    private final Brakes brakes;

    //Make the builder a static class. Then it will work.
    // If it is non-static, it would require an instance of its owning class
    // - and the point is not to have an instance of it, and even to forbid making instances without the builder.
    //czy ta klasa jest by default static?
    //i co znaczyz e klasa ejst statyczna?
    private Motorcycle(Builder builder) {
        this.engine = builder.engine;
        this.frame = builder.frame;
        this.drive = builder.drive;
        this.suspension = builder.suspension;
        this.brakes = builder.brakes;
    }

    public static class Builder {
        private Engine engine;
        private Frame frame;
        private Drive drive;
        private Suspension suspension;
        private Brakes brakes;

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder frame(Frame frame) {
            this.frame = frame;
            return this;
        }

        public Builder drive(Drive drive) {
            this.drive = drive;
            return this;
        }

        public Builder suspension(Suspension suspension) {
            this.suspension = suspension;
            return this;
        }

        public Builder brakes(Brakes brakes) {
            this.brakes = brakes;
            return this;
        }

        public Motorcycle buildMotorcycle() {
            return new Motorcycle(this);
        }
    }
}
