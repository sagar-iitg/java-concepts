package linkedlist;

public class ClientLinkedList {

    public static void main(String[] args) {
          
        LinkedList ll=new LinkedList();
     
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        
        ll.print();
        // ll.reverse();
        // ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();

        //System.out.println(ll.recSearch(4));

        //ll.print();
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());

    }
    
}
