class SMSDecorator extends BaseDecorator {

    public SMSDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sent message through SMSDecorator!");
    }
}