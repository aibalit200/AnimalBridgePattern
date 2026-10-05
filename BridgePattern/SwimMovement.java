package BridgePattern;

public class SwimMovement implements Movement {
    public void execute(double baseSpeed) {
        double speed = baseSpeed * AnimalConstants.SWIM_MULT;
        System.out.println("Swims in water at " + speed + " km per hour.");
    }
    public void stop() {
        System.out.println("Stops moving and floats.");
    }
    public void turn() {
        System.out.println("Changes direction in the water.");
    }
    public double getEnergyCost() {
        return AnimalConstants.SWIM_ENERGY;
    }
    public String getTypeName() {
        return "Swimming";
    }
}
