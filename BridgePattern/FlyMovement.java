package BridgePattern;

public class FlyMovement implements Movement {
    public void execute(double baseSpeed) {
        double speed = baseSpeed * AnimalConstants.FLY_MULT;
        System.out.println("Flies in the air at " + speed + " km per hour.");
    }
    public void stop() {
        System.out.println("Stops moving and lands.");
    }
    public void turn() {
        System.out.println("Changes direction in the air.");
    }
    public double getEnergyCost() {
        return AnimalConstants.FLY_ENERGY;
    }
    public String getTypeName() {
        return "Flying";
    }
}
