package BridgePattern;

public class Penguin extends Animal {
    public Penguin(Movement movement) {
        super(AnimalConstants.PENGUIN, AnimalConstants.ICE, AnimalConstants.PENGUIN_SPEED, movement);
    }
}
