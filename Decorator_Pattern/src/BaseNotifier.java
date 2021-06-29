class BaseNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("Sent message through BaseNotifier!");
    }
}