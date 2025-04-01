package Solid.Example3.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<NotificationType> notificationTypes) {
        for (NotificationType notificationType : notificationTypes) {
            switch (notificationType) {
                case SMS:
                    notificationType.sendSMSNotification();
                    break;
                case EMAIL:
                    notificationType.sendEmailNotification();
                    break;
                case PUSH:
                    notificationType.sendPushNotification();
                    break;
                case WHATSAPP:
                    notificationType.sendWhatsAppNotification();
                    break;
            }
        }
    }
}
