import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String message);
}

// Concrete Observer
class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Subject Interface
interface Subject {

    void subscribe(Observer o);

    void unsubscribe(Observer o);

    void notifyUsers();
}

// Concrete Subject
class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();

    private String title;

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyUsers() {

        for (Observer o : subscribers) {
            o.update(title);
        }
    }

    // New Video Upload
    public void uploadVideo(String title) {

        this.title = title;

        System.out.println("\nNew Video Uploaded : " + title);

        notifyUsers();
    }
}

// Main Class
public class ObserverDemo {

    public static void main(String[] args) {

        // Subject
        YouTubeChannel channel = new YouTubeChannel();

        // Observers
        Subscriber s1 = new Subscriber("Naveen");
        Subscriber s2 = new Subscriber("Rahul");
        Subscriber s3 = new Subscriber("Aman");

        // Subscribe
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        // Upload Video
        channel.uploadVideo("Observer Pattern in Java");

        // Unsubscribe One User
        channel.unsubscribe(s2);

        System.out.println("\nAfter Rahul Unsubscribed\n");

        // Upload Another Video
        channel.uploadVideo("Decorator Pattern in Java");
    }
}