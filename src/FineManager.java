import java.util.ArrayList;
import java.util.List;

public class FineManager {

    public List<String> checkOffenses(Car car, Location location) {
        List<String> fines = new ArrayList<>();

        for (TrafficSign sign : location.getSigns()) {
            String violation = sign.checkViolation(car, location.getName());
            if (violation != null) {
                fines.add(violation);
            }
        }
        return fines;
    }
}
