package BridgePattern;

public class WalkMovement implements Movement {
    public void execute(double baseSpeed) {
        double speed = baseSpeed * AnimalConstants.WALK_MULT;
        System.out.println("Walks on land at " + speed + " km per hour.");
    }
    public void stop() {
        System.out.println("Stops moving on land.");
    }
    public void turn() {
        System.out.println("Changes direction on land.");
    }
    public double getEnergyCost() {
        return AnimalConstants.WALK_ENERGY;
    }
    public String getTypeName() {
        return "Walking";
    }
}
