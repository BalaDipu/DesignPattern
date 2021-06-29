class MailDecorator extends BaseDecorator {

    public MailDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sent message through MailDecorator!");
    }
}

