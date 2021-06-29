public class Main {
    public static void main(String[] args) {
        Notifier notifier = new BaseNotifier();
        notifier = new SMSDecorator(notifier);
        notifier = new MailDecorator(notifier);

        notifier.send();
    }
}