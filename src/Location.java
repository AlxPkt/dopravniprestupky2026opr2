import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private List<TrafficSign> signs;

    public Location(String name) {
        this.name = name;
        this.signs = new ArrayList<>();
    }

    public void addSign(TrafficSign sign) {
        signs.add(sign);
    }

    public List<TrafficSign> getSigns() {
        return signs;
    }

    public String getName() { return name; }
}
