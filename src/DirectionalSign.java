public class DirectionalSign extends TrafficSign {
    private Action requiredAction;

    public DirectionalSign(String name, Action requiredAction) {
        super(name);
        this.requiredAction = requiredAction;
    }

    @Override
    public String checkViolation(Car car, String locationName) {

        if (car.getCurrentAction() != requiredAction && car.getCurrentAction() != Action.PARKING) {
            return "Pokuta: Nerespektování směrové značky '" + name + "' v lokaci " + locationName + ".";
        }
        return null;
    }
}
