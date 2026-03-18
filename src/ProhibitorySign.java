public class ProhibitorySign extends TrafficSign {
    private Action forbiddenAction;

    public ProhibitorySign(String name, Action forbiddenAction) {
        super(name);
        this.forbiddenAction = forbiddenAction;
    }

    public Action getForbiddenAction() {
        return forbiddenAction;
    }
}
