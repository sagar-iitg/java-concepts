package com.sagar.epam.gs;

class Node {
    String data;
    Node prev, next;

    Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DequeDS {
   Node front;
    Node rear;

    public DequeDS() {
        this.front = null;
        this.rear = null;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void push_front(String x) {
        if (front == null) {
            front = rear = new Node(x);
        } else {
           Node temp = new Node(x);
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
    }

    void push_back(String x) {
        if (front == null) {
            front = rear = new Node(x);
        } else {
           Node temp = new Node(x);
            temp.prev = rear;
            rear.next = temp;
            rear = temp;
        }
    }

    void pop_front() {
        if (front == null) return;

 Node temp = front;
        front = front.next;
        if (front != null)
            front.prev = null;
        else
            rear = null;
    }

    void pop_back() {
        if (front == null) return;

Node temp = rear;
        rear = rear.prev;
        if (rear != null)
            rear.next = null;
        else
            front = null;
    }

    void display() {
 Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    String peekFirst() {
        if (front == null) return null;
        return front.data;
    }

    String peekLast() {
        if (rear == null) return null;
        return rear.data;
    }

    public static void main(String[] args) {
        DequeDS obj = new DequeDS();
        System.out.println(obj.isEmpty());

        obj.push_back("Java");
        obj.push_back("Python");
        obj.push_back("C++");
        obj.push_front("JavaScript");

        obj.display();

        obj.pop_front();
        System.out.println("After pop_front:");
        obj.display();

        obj.pop_back();
        System.out.println("After pop_back:");
        obj.display();

        System.out.println("First Element: " + obj.peekFirst());
        System.out.println("Last Element: " + obj.peekLast());
    }
}
