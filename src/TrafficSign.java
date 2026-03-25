public abstract class TrafficSign {
    protected String name;

    public TrafficSign(String name) {
        this.name = name;
    }

    public abstract String checkViolation(Car car, String locationName);
}
