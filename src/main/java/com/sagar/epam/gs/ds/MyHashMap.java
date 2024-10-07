package com.sagar.epam.gs.ds;

import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class MyHashMap<K, V> { // K for Key, V for Value

    static class Entry<K, V> {
        final K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    int size = 1000; // Size of the hash table
    LinkedList<Entry<K, V>>[] table = new LinkedList[size];

    // Constructor
    public MyHashMap() {
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to calculate the index
    private int getIndex(K key) {
        return key.hashCode() % size;
    }

    // Put a key-value pair into the map
    public void put(K key, V value) {
        int index = getIndex(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key already exists
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }

    // Get the value for a given key
    public V get(K key) {
        int index = getIndex(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Return null if key is not found
    }

    // Check if the map contains a key
    public boolean containsKey(K key) {
        int index = getIndex(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // Remove a key-value pair
    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry); // Remove the entry if found
                return;
            }
        }
    }

    // Get the size of the map (total number of key-value pairs)
    public int size() {
        int count = 0;
        for (LinkedList<Entry<K, V>> bucket : table) {
            count += bucket.size();
        }
        return count;
    }

    // Get a set of all keys in the map
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                keys.add(entry.key);
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        // Create a MyHashMap instance with Integer keys and String values
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "One");
        myHashMap.put(2, "Two");
        System.out.println(myHashMap.get(1)); // Returns "One"
        myHashMap.put(2, "Three");
        System.out.println(myHashMap.get(2)); // Returns "Three"
        myHashMap.remove(1);
        System.out.println(myHashMap.get(1)); // Returns null (not found)
        System.out.println("Contains key 2? " + myHashMap.containsKey(2)); // Returns true
        System.out.println("Total size: " + myHashMap.size()); // Returns size
        System.out.println("Key Set: " + myHashMap.keySet()); // Returns key set
    }
}
