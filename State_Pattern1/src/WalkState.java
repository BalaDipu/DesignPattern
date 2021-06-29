public class WalkState implements IState {
    private Robot robot;
    public WalkState(Robot robot){
        this.robot = robot;

    }

    @Override
    public void walking() {
        System.out.println("Robot is already in walking mood!");
    }

    @Override
    public void cooking() {
        System.out.println("The robot is cooking your order");
        robot.setState_cookState();
    }

    @Override
    public void switching() {
        System.out.println("Robot switched off");
        robot.setState_offState();
    }
}
