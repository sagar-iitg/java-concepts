package com.sagar.epam.gs;

import java.util.Deque;

public class DequeDSArray {

    int front;
    int rear;
    int size;
    int[] arr;

    public DequeDSArray(int n) {
        this.size=n;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[n];
    }

    boolean isEmpty(){
        return front==-1;

    }

    boolean isFull(){
        return  (rear+1)%size==front;
    }

    void pushFront(int x){
        if(isEmpty()){
            front=0;
            rear=0;
            arr[0]=x;
        }
        else if(isFull()) {
            return;
        }
        else {
            front=(front-1+size)%size;
            arr[front]=x;
        }
    }

    void push_back(int x){
        if(isEmpty()){
            front=0;
            rear=0;
            arr[0]=x;
        }else if(isFull()){
            return;
        }
        else{
            rear=(rear+1)%size;
            arr[rear]=x;
        }

    }

    void pop_front(){

        if(isEmpty()){
            return;
        }
        else{
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%size;
            }

        }
    }

    void pop_back(){
        if(isEmpty()){
            return;
        }

        else{
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                rear=(rear-1+size)%size;
            }


        }
    }

    int peekFirst(){
        if (isEmpty()) {
            System.out.println("Deque is empty. No elements to peek at the back.");
            return -1;
        }
        return arr[front];
    }
    int peekLast(){
        if (isEmpty()) {
            System.out.println("Deque is empty. No elements to peek at the back.");
            return -1;
        }
        return  arr[rear];
    }
    // Display all elements of the deque
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;  // Move to the next index circularly
        }
        System.out.println();
    }


    public static void main(String[] args) {

        DequeDSArray obj=new DequeDSArray(10);
        obj.push_back(10);
        obj.push_back(20);
        obj.push_back(30);
        System.out.println(obj.peekFirst());
        System.out.println(obj.peekLast());
        obj.display();

    }


}
