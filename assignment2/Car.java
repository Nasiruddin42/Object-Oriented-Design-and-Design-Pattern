
public class Car {
    private final String modelName;
    private final String engineType;
    private final String color;
    private final String transmission;
    private final boolean sunroof;
    private final boolean infotainmentSystem;

    private Car(CarBuilder builder) {
        this.modelName = builder.modelName;
        this.engineType = builder.engineType;
        this.color = builder.color;
        this.transmission = builder.transmission;
        this.sunroof = builder.sunroof;
        this.infotainmentSystem = builder.infotainmentSystem;
    }

    public void displayConfiguration() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Sunroof: " + (sunroof ? "Yes" : "No"));
        System.out.println("Infotainment System: " + (infotainmentSystem ? "Yes" : "No"));
    }

    public static class CarBuilder {
        private String modelName;
        private String engineType;
        private String color;
        private String transmission;
        private boolean sunroof;
        private boolean infotainmentSystem;

        public CarBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public CarBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setInfotainmentSystem(boolean infotainmentSystem) {
            this.infotainmentSystem = infotainmentSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
