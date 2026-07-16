package MiniPOS;

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}