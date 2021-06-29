public class main {
    public static void main(String[] args) {
        
        Duck rubberDuck = new Duck( new normalQuack(), new normalDisplay(), new cantFly() );

        rubberDuck.print();
    }
}
