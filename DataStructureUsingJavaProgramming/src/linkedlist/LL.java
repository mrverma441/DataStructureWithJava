package linkedlist;
public class LL {
 
   Node head;
   private int size;
 
   LL () {
       size = 0;
   }
 
    class Node {
       String data;
       Node next;
 
       Node(String data) {
           this.data = data;
           this.next = null;
           size++;
       }
   }
 
   public void addFirst(String data) {
       Node newNode = new Node(data);
       if(head==null)
       {
    	   head=newNode;
    	   return;
       }
       newNode.next = head;
       head = newNode;
   }
 
   public void addLast(String data) {
       Node newNode = new Node(data);
 
       if(head == null) {
           head = newNode;
           return;
       }
 
       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }
 
       lastNode.next = newNode;
   }
 
   public void printList() {
       Node currNode = head;
 
       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
 
       System.out.println("null");
   }
   public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }
 
       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }

   public void removeFirst() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
 
       head = this.head.next;
       size--;
   }
   public Node reverseListRecursive(Node head) {
       //empty node || last node or only one node
       if(head == null || head.next == null) {
           return head;
       }
 
       Node newHead = reverseListRecursive(head.next);
      
       head.next.next = head;
       head.next = null;
       return newHead;
   }

   public void removeLast() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
 
       size--;
       if(head.next == null) {
           head = null;
           return;
       }
 
       Node currNode = head;
       Node lastNode = head.next;
       while(lastNode.next != null) {
           currNode = currNode.next;
           lastNode = lastNode.next;
       }
 
       currNode.next = null;
   }
 
   public int getSize() {
       return size;
   }
 
 
 
   public static void main(String args[]) {
       LL list = new LL();
       list.addLast("is");
       list.addLast("a");
       list.addLast("list");
       list.printList();
 
       list.addFirst("this");
       list.printList();
       System.out.println(list.getSize()); 
 
       //list.removeFirst();
       //list.printList();
 
       //list.removeLast();
       //list.printList();
       list.reverseList();
       //list.reverseListRecursive(list.head);
       list.printList();
   }
}
