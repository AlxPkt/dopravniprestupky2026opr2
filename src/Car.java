public class Car {
    private String plateNumber;
    private Action currentAction;
    private int currentSpeed;

    public Car(String plateNumber, Action currentAction, int currentSpeed) {
        this.plateNumber = plateNumber;
        this.currentAction = currentAction;
        this.currentSpeed = currentSpeed;
    }

    public Action getCurrentAction() { return currentAction; }
    public int getCurrentSpeed() { return currentSpeed; }
    public String getPlateNumber() { return plateNumber; }
}
