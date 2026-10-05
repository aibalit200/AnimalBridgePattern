package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion(new WalkMovement());
        lion.showProfile();
        lion.travel();
        lion.hunt();
        lion.halt();
        lion.rest();

        System.out.println();
        System.out.println("Penguin changes its movement at runtime.");
        Animal penguin = new Penguin(new WalkMovement());
        penguin.showProfile();
        penguin.travel();
        penguin.setMovement(new SwimMovement());
        penguin.showProfile();
        penguin.hunt();
        penguin.halt();

        System.out.println();
        System.out.println("Status check.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Checking animal " + i);
        }
    }
}
