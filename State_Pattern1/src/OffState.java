public class OffState implements IState{
    private Robot robot;
    public OffState(Robot robot){
    this.robot = robot;
    }

    @Override
    public void walking() {
        System.out.println("Robot is walking! :)");
        robot.setState_walkState();
    }

    @Override
    public void cooking() {
        System.out.println("Can't cook!!");
    }

    @Override
    public void switching() {
        System.out.println("Already switched off !!");
    }
}
