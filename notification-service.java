public class NotificationService {

    public String sendNotification(int userId, String message, int priority) {
        // simulate queue logic
        if(priority == 1){
            return "High Priority Notification Sent";
        }
        return "Notification Queued";
    }
}
