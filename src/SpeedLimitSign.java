public class SpeedLimitSign extends TrafficSign {
    private int maxSpeed;

    public SpeedLimitSign(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String checkViolation(Car car, String locationName) {
        if (car.getCurrentSpeed() > maxSpeed) {
            return "Pokuta: Překročení rychlosti (" + car.getCurrentSpeed() +
                    " km/h při limitu " + maxSpeed + " km/h) v lokaci " + locationName + ".";
        }
        return null;
    }
}
