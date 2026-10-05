package BridgePattern;

public interface Movement {
    void execute(double baseSpeed);
    void stop();
    void turn();
    double getEnergyCost();
    String getTypeName();
}
