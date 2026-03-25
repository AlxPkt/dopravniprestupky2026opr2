public class ProhibitorySign extends TrafficSign {
    private Action forbiddenAction;

    public ProhibitorySign(String name, Action forbiddenAction) {
        super(name);
        this.forbiddenAction = forbiddenAction;
    }

    @Override
    public String checkViolation(Car car, String locationName) {
        if (car.getCurrentAction() == forbiddenAction) {
            return "Pokuta: Porušení zákazu '" + name + "' v lokaci " + locationName + ".";
        }
        return null;
    }
}
