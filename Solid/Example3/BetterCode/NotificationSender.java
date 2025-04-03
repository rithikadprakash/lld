package Solid.Example3.BetterCode;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<String> notificationTypes, String message) {
        for (String notificationType : notificationTypes) {
            switch (notificationType) {
                case "SMS":
                    SMSNotification smsNotification = new SMSNotification();
                    smsNotification.sendSMSNotification(message);
                    break;
                case "EMAIL":
                    EmailNotification emailNotification = new EmailNotification();
                    emailNotification.sendEmailNotification(message);
                    break;
                case "PUSH":
                    PushNotification pushNotification = new PushNotification();
                    pushNotification.sendPushNotification(message);
                    break;
                case "WHATSAPP":
                    WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
                    whatsAppNotification.sendWhatsAppNotification(message);
                    break;
            }
        }
    }
}
