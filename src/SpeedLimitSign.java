public class SpeedLimitSign implements TrafficSign {
    private String name;
    private int maxSpeed;

    public SpeedLimitSign(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
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
