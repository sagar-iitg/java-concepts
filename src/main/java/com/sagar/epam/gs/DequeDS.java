package com.sagar.epam.gs;


import java.util.Deque;

class Node{

    int data;
    Node prev,next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DequeDS {


        Node front;
        Node rear;

    public DequeDS() {
      this.front=null;
      this.rear=null;
    }



    void push_front(int x){

        //deque is empty
        if(front==null){
            front=rear=new Node(x);
        }
        else{

            Node temp=new Node(x);
            temp.next=front;
            front.prev=temp;
            front=temp;

        }
    }

    void push_back(int x){
        if(front==null){
            front=rear=new Node(x);
        }
        else{
            Node temp=new Node(x);
            rear.next=temp;
            temp.prev=rear;
            rear=temp;

        }
    }

    void pop_front(){

        if(front==null) return;
        else{
            Node temp=front;
            front=front.next;
            if(front!=null)
                front.prev=null;
            else{
                rear=null;
            }
        }
    }

    void pop_back(){
        if(front==null) return;

        else{
            Node temp=rear;
            rear=rear.prev;
            if(rear!=null){
                rear.next=null;
            }else{
                front=null;
            }
        }

    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    int peekFirst(){
        if(front==null) return -1;
        else{
            return front.data;
        }
    }

    int peekLast(){
        if(rear==null) return -1;
        else{
            return rear.data;
        }
    }

    public static void main(String[] args) {

        DequeDS obj=new DequeDS();
        obj.push_back(10);
        obj.push_back(20);
        obj.push_back(30);
        obj.push_front(40);
        obj.display();
        obj.pop_front();
        obj.display();
    }



}
