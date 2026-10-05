package BridgePattern;

public class Snake extends Animal {
    public Snake(Movement movement) {
        super(AnimalConstants.SNAKE, AnimalConstants.FOREST, AnimalConstants.SNAKE_SPEED, movement);
    }
}
