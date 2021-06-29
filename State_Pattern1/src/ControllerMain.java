public class ControllerMain {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.currentState.walking();
        robot.currentState.cooking();
        robot.currentState.switching();
        robot.currentState.walking();
        robot.currentState.switching();
    }
}
