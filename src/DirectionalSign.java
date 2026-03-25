public class DirectionalSign implements TrafficSign {
    private String name;
    private Action requiredAction;

    public DirectionalSign(String name, Action requiredAction) {
        this.name = name;
        this.requiredAction = requiredAction;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String checkViolation(Car car, String locationName) {
        if (car.getCurrentAction() != requiredAction && car.getCurrentAction() != Action.PARKING) {
            return "Pokuta: Nerespektování směrové značky '" + name + "' v lokaci " + locationName + ".";
        }
        return null;
    }
}
