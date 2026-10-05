package BridgePattern;

public abstract class Animal {
    protected String name;
    protected String habitat;
    protected double baseSpeed;
    protected Movement movement;
    protected double currentEnergy;

    protected Animal(String name, String habitat, double baseSpeed, Movement movement) {
        this.name = name;
        this.habitat = habitat;
        this.baseSpeed = baseSpeed;
        this.movement = movement;
        this.currentEnergy = AnimalConstants.MAX_ENERGY;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Movement getMovement() {
        return movement;
    }

    public void showProfile() {
        System.out.println("Species: " + name);
        System.out.println("Habitat: " + habitat);
        System.out.println("Base speed: " + baseSpeed + " km per hour");
        System.out.println("Movement: " + movement.getTypeName());
    }

    public void travel() {
        System.out.println(name + " is traveling.");
        movement.execute(baseSpeed);
        currentEnergy = currentEnergy - movement.getEnergyCost();
        System.out.println("Energy remaining: " + currentEnergy);
    }

    public void hunt() {
        System.out.println(name + " is hunting.");
        movement.execute(baseSpeed * AnimalConstants.HUNT_SPEED_MULT);
        movement.turn();
        currentEnergy = currentEnergy - movement.getEnergyCost() * 2;
        System.out.println("Energy remaining: " + currentEnergy);
    }

    public void rest() {
        System.out.println(name + " is resting in the " + habitat + ".");
        currentEnergy = currentEnergy + AnimalConstants.REST_RESTORE;
        if (currentEnergy > AnimalConstants.MAX_ENERGY) {
            currentEnergy = AnimalConstants.MAX_ENERGY;
        }
        System.out.println("Energy restored to: " + currentEnergy);
    }

    public void halt() {
        System.out.println(name + " is stopping.");
        movement.stop();
    }
}
