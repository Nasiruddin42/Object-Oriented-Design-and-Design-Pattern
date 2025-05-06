public class CarCustomizationSystem {
    public static void main(String[] args) {
        // Build Default Car
        Car defaultCar = new Car.CarBuilder()
                .setModelName("Default Model")
                .setEngineType("Petrol")
                .setColor("White")
                .setTransmission("Manual")
                .setSunroof(false)
                .setInfotainmentSystem(false)
                .build();

        System.out.println("----- Default Car Configuration -----");
        defaultCar.displayConfiguration();

        // Build Customized Car
        Car customizedCar = new Car.CarBuilder()
                .setModelName("Tesla Model 3")
                .setEngineType("Electric")
                .setColor("Midnight Silver")
                .setTransmission("Automatic")
                .setSunroof(true)
                .setInfotainmentSystem(true)
                .build();

        System.out.println("\n----- Customized Car Configuration -----");
        customizedCar.displayConfiguration();
    }
}
