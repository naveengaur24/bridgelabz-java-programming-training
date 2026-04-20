package DSA.HashMap;

import java.util.LinkedList;

public class Implementation {

    private LinkedList<Entity>[] buckets;
    private int size;
    private int capacity;

    public Implementation() {
        capacity = 16; // initial capacity
        buckets = new LinkedList[capacity];
    }

    // PUT METHOD
    public void put(String key, String value) {
        int index = getIndex(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // check if key already exists
        for (Entity e : buckets[index]) {
            if (e.key.equals(key)) {
                e.value = value; // update
                return;
            }
        }

        // add new key-value
        buckets[index].add(new Entity(key, value));
        size++;
    }

    // GET METHOD
    public String get(String key) {
        int index = getIndex(key);

        if (buckets[index] != null) {
            for (Entity e : buckets[index]) {
                if (e.key.equals(key)) {
                    return e.value;
                }
            }
        }
        return null;
    }

    // REMOVE METHOD
    public void remove(String key) {
        int index = getIndex(key);

        if (buckets[index] != null) {
            for (Entity e : buckets[index]) {
                if (e.key.equals(key)) {
                    buckets[index].remove(e);
                    size--;
                    return;
                }
            }
        }
    }

    // HASH FUNCTION
    private int getIndex(String key) {
        int hash = Math.abs(key.hashCode());
        return hash % capacity;
    }

    // ENTITY CLASS
    private class Entity {
        String key;
        String value;

        Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Implementation map = new Implementation();

        map.put("name", "John");
        map.put("age", "30");
        map.put("city", "New York");

        System.out.println(map.get("name")); // John
        System.out.println(map.get("age"));  // 30

        map.put("age", "35"); // update
        System.out.println(map.get("age"));  // 35

        map.remove("city");
        System.out.println(map.get("city")); // null
    }
}