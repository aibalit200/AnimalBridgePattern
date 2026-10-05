package BridgePattern;

public class SlitherMovement implements Movement {
    public void execute(double baseSpeed) {
        double speed = baseSpeed * AnimalConstants.SLITHER_MULT;
        System.out.println("Slithers on the ground at " + speed + " km per hour.");
    }
    public void stop() {
        System.out.println("Stops moving and coils up.");
    }
    public void turn() {
        System.out.println("Changes direction smoothly.");
    }
    public double getEnergyCost() {
        return AnimalConstants.SLITHER_ENERGY;
    }
    public String getTypeName() {
        return "Slithering";
    }
}
