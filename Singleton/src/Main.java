public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        if(db1 == db2) {
            System.out.println("Singleton is working!!");
        }
    }
}