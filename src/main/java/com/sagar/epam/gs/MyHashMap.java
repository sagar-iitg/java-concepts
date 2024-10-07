package com.sagar.epam.gs;

import java.util.LinkedList;



//put
//get
//containsKey
//remove
//size
//keySet

public class MyHashMap {


    static class Entry{
        final int key;
        int value;
        Entry(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    int size=1000; //size of the hashTable


    //int[] arr=new int[10]
    //float[] arr
    //String[] str
    //array of linked list
    LinkedList<Entry>[] table=new LinkedList[size];

    public MyHashMap() {
       // table=new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }
    // Hash function to calculate the index
    private int getIndex(int key) {
        return Integer.hashCode(key) % size;
    }

    public void put(int key,int value){
        int index = getIndex(key);
        for(Entry entry:table[index]){
            if(entry.key==key){
                entry.value=value; //update value if key already exist
                return;
            }
        }
        table[index].add(new Entry(key,value));
    }

    public int get(int key){
        int index = getIndex(key);
        for(Entry entry:table[index]){
            if(entry.key==key){
                return entry.value;
            }
        }
        return -1;
    }

    public void remove(int key){
        int index = getIndex(key);
        LinkedList<Entry> bucket = table[index];
        for (Entry entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry); // Remove the entry if found
                return;
            }
        }

    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);        // Insert (1, 1)
        myHashMap.put(2, 2);        // Insert (2, 2)
        System.out.println(myHashMap.get(1)); // Returns 1
        myHashMap.put(2, 3);        // Update value for key 2
        System.out.println(myHashMap.get(2));
        myHashMap.remove(1);        // Remove key 1
        System.out.println(myHashMap.get(1)); // Returns -1 (not found)
    }
}
