package Solid.Example3.ImprovedCode;

public class PushNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        // Logic to send push notification
        System.out.println("Sending push notification..." + message);
    }
}
