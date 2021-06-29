public class OnState implements IState {
    private Robot robot;
    public OnState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walking() {
        System.out.println("Robot is walking! :)");
        robot.setState_walkState();
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
