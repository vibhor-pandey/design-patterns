package design.patterns.creational.prototype;

public class NasaApollo extends SpaceCraft {

    public NasaApollo(String name, int escapeVelocity, int fuelConsumption) {
        super(name, escapeVelocity, fuelConsumption);
    }

    public String boost() {
        return "Boosting Started - " + name
                + "\nEscape Velocity - " + escapeVelocity
                + "\n Fuel Consumption (in Kg) - " + fuelConsumptionPerMinInKG;
    }

    @Override
    public SpaceCraft clone() {
        return new NasaApollo(this.getName(), this.getEscapeVelocity(), this.getFuelConsumptionPerMinInKG());
    }
}
