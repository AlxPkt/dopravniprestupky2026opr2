import java.util.ArrayList;
import java.util.List;

public class FineManager {

    public List<String> checkOffenses(Car car, Location location) {
        List<String> fines = new ArrayList<>();

        for (TrafficSign sign : location.getSigns()) {
            if (sign instanceof ProhibitorySign) {
                ProhibitorySign pSign = (ProhibitorySign) sign;
                if (car.getCurrentAction() == pSign.getForbiddenAction()) {
                    fines.add("Přestupek: " + car.getPlateNumber() + " porušil " + pSign.getName());
                }
            }

            if (sign instanceof SpeedLimitSign) {
                SpeedLimitSign sSign = (SpeedLimitSign) sign;
                if (car.getCurrentSpeed() > sSign.getMaxSpeed()) {
                    fines.add("Přestupek: " + car.getPlateNumber() + " překročil rychlost ("
                            + car.getCurrentSpeed() + " km/h v zóně " + sSign.getMaxSpeed() + " km/h)");
                }
            }
        }
        return fines;
    }
}
