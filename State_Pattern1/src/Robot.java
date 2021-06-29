public class Robot {
    private IState onState;
    private IState walkState;
    private IState cookState;
    private IState offState;

    public IState currentState;

    public Robot(){
        this.onState = new OnState(this);
        this.walkState = new WalkState(this);
        this.cookState = new CookState(this);
        this.offState = new OffState(this);

        this.currentState = onState;
    }
    public void setState_onState() { currentState = onState; }
    public void setState_walkState() {
        currentState = walkState;
    }
    public void setState_cookState() {
        currentState = cookState;
    }
    public void setState_offState() {
        currentState = offState;
    }
}
