package Solid.Example3.ImprovedCode;

public class WhatsAppNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        // Logic to send WhatsApp notification
        System.out.println("Sending WhatsApp notification..." + message);
    }
}
