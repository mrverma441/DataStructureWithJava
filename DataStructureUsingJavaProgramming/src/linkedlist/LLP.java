package linkedlist;

import linkedlist.LL.Node;

public class LLP {
	Node head;
	class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	public void addfirst(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	public void addlast(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node lastnode=head;
		while(lastnode.next!=null)
		{
			lastnode=lastnode.next;
			
		}
		lastnode.next=newNode;
	}
	public void removefirst()
	{
		if(head==null)
		{
			System.out.println("List is empty,nothing to delete");
		}
		head=head.next;
	}
	public void printlist()
	{
		Node currnode=head;
		while(currnode!=null)
		{
			System.out.print(currnode.data+"->");
			currnode=currnode.next;
			
		}
		System.out.println("null");
	}
	 public void removeLast() {
	       if(head == null) {
	           System.out.println("Empty List, nothing to delete");
	           return;
	       }
	 
	      
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


	public static void main(String[] args) {
		LLP list=new LLP();
		list.addfirst("Verma");
		list.addfirst("Monu");
		list.addlast("Verma");
		list.addfirst("My");
		list.addfirst("name");
		list.addfirst("is");
		list.removefirst();
		list.removeLast();

		list.printlist();

	}

}
