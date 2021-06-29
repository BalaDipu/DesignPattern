class BaseDecorator implements Notifier {

    protected Notifier wrappedNotifier;

    public BaseDecorator(Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public void send() {
        wrappedNotifier.send();
    }
}