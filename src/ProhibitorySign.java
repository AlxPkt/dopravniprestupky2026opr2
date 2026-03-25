public class ProhibitorySign implements TrafficSign {
    private String name;
    private Action forbiddenAction;

    public ProhibitorySign(String name, Action forbiddenAction) {
        this.name = name;
        this.forbiddenAction = forbiddenAction;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String checkViolation(Car car, String locationName) {
        if (car.getCurrentAction() == forbiddenAction) {
            return "Pokuta: Porušení zákazu '" + name + "' v lokaci " + locationName + ".";
        }
        return null;
    }
}
