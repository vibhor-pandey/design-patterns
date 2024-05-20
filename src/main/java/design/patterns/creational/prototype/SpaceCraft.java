package design.patterns.creational.prototype;

public abstract class SpaceCraft {
    protected String name;
    protected int escapeVelocity;
    protected int fuelConsumptionPerMinInKG;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEscapeVelocity(int escapeVelocity) {
        this.escapeVelocity = escapeVelocity;
    }

    public void setFuelConsumptionPerMinInKG(int fuelConsumptionPerMinInKG) {
        this.fuelConsumptionPerMinInKG = fuelConsumptionPerMinInKG;
    }

    public int getEscapeVelocity() {
        return escapeVelocity;
    }

    public int getFuelConsumptionPerMinInKG() {
        return fuelConsumptionPerMinInKG;
    }

    protected SpaceCraft(String name, int escapeVelocity, int fuelConsumption) {
        this.name = name;
        this.escapeVelocity = escapeVelocity;
        this.fuelConsumptionPerMinInKG = fuelConsumption;
    }

    public String boost() {
        return "Boosting Started - " + name
                + "\nEscape Velocity - " + escapeVelocity
                + "\n Fuel Consumption (in Kg) - " + fuelConsumptionPerMinInKG;
    }

    protected abstract SpaceCraft clone() throws CloneNotSupportedException;
}
