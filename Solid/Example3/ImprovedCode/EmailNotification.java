package Solid.Example3.ImprovedCode;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        // Logic to send email notification
        System.out.println("Sending email notification..." + message);
    }
}
