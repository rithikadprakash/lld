package Solid.Example3.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    PUSH,
    WHATSAPP;

    public void sendSMSNotification() {
        System.out.println("Sending SMS notification");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email notification");
    }

    public void sendPushNotification() {
        System.out.println("Sending Push notification");
    }

    public void sendWhatsAppNotification() {
        System.out.println("Sending WhatsApp notification");
    }
}

