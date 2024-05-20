package design.patterns.creational.prototype;

public class Chandrayaan extends SpaceCraft {

    public Chandrayaan(String name, int escapeVelocity, int fuelConsumption) {
        super(name, escapeVelocity, fuelConsumption);
    }

    @Override
    public SpaceCraft clone() {
        return new Chandrayaan(this.getName(), this.getEscapeVelocity(), this.getFuelConsumptionPerMinInKG());
    }
}
