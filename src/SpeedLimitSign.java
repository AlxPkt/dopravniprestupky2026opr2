public class SpeedLimitSign extends TrafficSign {
    private int maxSpeed;

    public SpeedLimitSign(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
