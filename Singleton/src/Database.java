class Database {
    private static volatile Database instance;

    private Database() {
        System.out.println("Connected !!");
    }

    public static synchronized Database getInstance() {
        if (instance == null) instance = new Database();

        return instance;
    }
}

