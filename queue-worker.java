import java.util.LinkedList;
import java.util.Queue;

class Notification {
    int userId;
    String message;
    int priority;

    Notification(int userId, String message, int priority) {
        this.userId = userId;
        this.message = message;
        this.priority = priority;
    }
}

public class QueueWorker {

    private Queue<Notification> queue = new LinkedList<>();

    // Add notification to queue
    public void addToQueue(Notification notification) {
        queue.offer(notification);
        System.out.println("Notification added to queue");
    }

    // Process notifications
    public void processQueue() {
        while (!queue.isEmpty()) {
            Notification notif = queue.poll();
            send(notif);
        }
    }

    // Simulate sending notification
    private void send(Notification notif) {
        System.out.println(
            "Sending notification to User " + notif.userId +
            " | Message: " + notif.message
        );
    }

    public static void main(String[] args) {
        QueueWorker worker = new QueueWorker();

        worker.addToQueue(new Notification(1, "Order Shipped", 1));
        worker.addToQueue(new Notification(2, "Discount Offer", 2));

        worker.processQueue();
    }
}
