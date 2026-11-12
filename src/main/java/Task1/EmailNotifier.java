package Task1;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to: " + recipient);
        System.out.println("Message: " + message);
    }
}