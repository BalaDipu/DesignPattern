public class CookState implements IState{
    private Robot robot;
    public CookState(Robot robot){
    this.robot = robot;
    }

    @Override
    public void walking() {
        System.out.println("Robot is walking! :)");
        robot.setState_walkState();
    }

    @Override
    public void cooking() {
        System.out.println("The robot is already in the cooking mood");
    }

    @Override
    public void switching() {
        System.out.println("You can't switch off");
    }
}
