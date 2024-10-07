package com.sagar.epam.gs.practice;

import java.util.LinkedList;

class MyHashMap{

    private static class Entry{
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int size=10000;
    LinkedList<Entry>[] bucket;

    public MyHashMap() {
        bucket=new LinkedList[size];
        for (int i=0;i<size;i++){
            bucket[i]=new LinkedList<>();
        }
    }

    int hash(int key){
        return Integer.hashCode(key);
    }

    void put(int key,int value){
        int index=hash(key);
        for(Entry entry:bucket[index]){
            if(entry.key==key){
                entry.value=value;
                return;
            }
        }
        bucket[index].add(new Entry(key,value));
    }
    int get(int key){
        int index=hash(key);
        for(Entry entry:bucket[index]){
            if(entry.key==key){

                return entry.value;
            }
        }
        return -1;
    }
    void remove(int key){
        int index=hash(key);
        LinkedList<Entry> removeEle=bucket[index];
        for( Entry entry:removeEle){
            if(entry.key==key){
                removeEle.remove(entry);
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