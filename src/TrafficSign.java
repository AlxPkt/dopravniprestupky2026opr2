public interface TrafficSign {
    String getName();
    String checkViolation(Car car, String locationName);
}
