abstract class Person {

    public void getUp(){
        System.out.println("This person get up.");
    }

    public void eat(){
        System.out.println("This person eating");
    }

    abstract void work();

    public void sleep(){
        System.out.println("This person going to sleep");
    }

    public void run(){
        getUp();
        eat();
        work();
        sleep();
    }
}
