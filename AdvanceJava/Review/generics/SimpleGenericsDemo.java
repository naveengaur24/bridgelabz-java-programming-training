package AdvanceJava.Review.generics;

import java.util.*;

public class SimpleGenericsDemo {
    public static void main(String[] args) {

        // Task 11---> Generic Registry krna  2 registry banani hai ek light ke liye aur ek lock ke liye
        Registry<LightController> lightRegistry = new Registry<>();
        Registry<LockController> lockRegistry = new Registry<>();

        // device register krna hai dono registry me
        lightRegistry.register(new LightController(1, "Living Room Light", 1200));
        lightRegistry.register(new LightController(2, "Bedroom Light", 900));

        lockRegistry.register(new LockController(3, "Front Door Lock", 2500));

        System.out.println("Lights: " + lightRegistry.getAll());
        System.out.println("Locks: " + lockRegistry.getAll());

        // device deregister krna hai light registry se id 2 ko remove krna hai
        lightRegistry.deregister(2);
        System.out.println("After removing light id 2: " + lightRegistry.getAll());

    


        // Task 12: Generic findCheapest method

        //list create krna hai prices ka aur devices ka
        List<Integer> prices = Arrays.asList(1000, 500, 1500, 700);
        //print cheapest price
        System.out.println("Cheapest price: " + findCheapest(prices));

        List<SmartDevice> devices = Arrays.asList(
                new LightController(5, "Kitchen Light", 800),
                new LockController(6, "Garage Lock", 3000),
                new LightController(7, "Porch Light", 600)
        );

        // print cheapest device price
        System.out.println("Cheapest device: " + findCheapest(devices));


        // Task 13: LinkedList as Queue
        Queue<String> events = new LinkedList<>();

        events.offer("Turn on Light");
        events.offer("Lock Door");
        events.offer("Turn off Light");
        events.offer("Unlock Door");
        events.offer("Dim Light");
        events.offer("Turn on Fan");

        System.out.println("Next event: " + events.peek());

        System.out.println("Processing events:");
        while (!events.isEmpty()) {
            System.out.println(events.poll());
        }


        // Task 14: HashSet and TreeSet
        HashSet<String> zones = new HashSet<>();

        zones.add("Living Room");
        zones.add("Bedroom");
        zones.add("Kitchen");
        zones.add("Living Room"); // duplicate ignored

        System.out.println("Unique zones: " + zones);

        TreeSet<String> sortedZones = new TreeSet<>(zones);
        System.out.println("Sorted zones: " + sortedZones);


        // Task 15: HashMap
        HashMap<String, DeviceController> map = new HashMap<>();

        map.put("L1", new LightController(1, "Living Room Light", 1200));
        map.put("L2", new LightController(2, "Bedroom Light", 900));
        map.put("D1", new LockController(3, "Front Door Lock", 2500));
        map.put("D2", new LockController(4, "Back Door Lock", 2200));
        map.put("L2", new LightController(2, "Updated Bedroom Light", 950));
        map.remove("D2");

        for (Map.Entry<String, DeviceController> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        DeviceController result = map.getOrDefault(
                "X1",
                new LightController(0, "Default Device", 0)
        );

        System.out.println("Missing key result:" + result);
    }

    public static <T extends Comparable<T>> T findCheapest(List<T> items) {
        T cheapest = items.get(0);
        for (T item : items) {
            if (item.compareTo(cheapest) < 0) {
                cheapest = item;
            }
        }
        return cheapest;
    }
}


// Generic class
class Registry<T extends SmartDevice> {
    ArrayList<T> devices = new ArrayList<>();

    void register(T device) {
        devices.add(device);
    }

    void deregister(int id) {
        devices.removeIf(device -> device.id == id);
    }

    ArrayList<T> getAll() {
        return devices;
    }
}

// Interface
interface DeviceController {
}

// Base class
class SmartDevice implements DeviceController, Comparable<SmartDevice> {
    int id;
    String name;
    double price;

    SmartDevice(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(SmartDevice other) {
        return Double.compare(this.price, other.price);
    }

    public String toString() {
        return name + " Rs." + price;
    }
}


// Child classes
class LightController extends SmartDevice {
    LightController(int id, String name, double price) {
        super(id, name, price);
    }
}

class LockController extends SmartDevice {
    LockController(int id, String name, double price) {
        super(id, name, price);
    }
}

