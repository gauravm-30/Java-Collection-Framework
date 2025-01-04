package com.javacollection.maps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTestDrive {
    public static void main(String[] args) {
        // Create a WeakHashMap
        //contains the weak reference of the keys.
        Map<String, String> weakMap = new WeakHashMap<>();

        // Create some keys
        String key1 = new String("key1");
        String key2 = new String("key2");

        // Put entries into the map
        weakMap.put(key1, "value1");
        weakMap.put(key2, "value2");

        // Print the map
        System.out.println("Initial map: " + weakMap);

        // Remove the strong references to the keys
        key1 = null;
        key2 = null;

        // Suggest garbage collection
        System.gc();

        // Wait for a moment to let GC do its work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the map again to see if entries have been collected
        System.out.println("Map after GC: " + weakMap);
    }
}

