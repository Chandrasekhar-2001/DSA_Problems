package com.DSA.DoublyLinkedList;

public class InsertBeforeTailInDDLL {
	public static Node InsertBeforeTail(Node head, int value) {
		if(head==null) {
			return new Node(value);
		}
		if(head.next == null) {
			return new Node(value,head,null);
		}
		Node tail=head,previous=null;
		
		while(tail.next!=null) {
			tail = tail.next;
		}
		Node newNode = new Node(value,tail,tail.previous);
		previous = tail.previous;
		previous.next = newNode;
		tail.previous=newNode;
		return head;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7};
		Node head = InsertAtHeadAndTailInDDL.createDDLinkedList(arr);
		Node insertBeforeTail = InsertBeforeTail(head,100 );
		 while(insertBeforeTail != null) {
			 System.out.print(insertBeforeTail.data+"  ");
			 insertBeforeTail = insertBeforeTail.next;
		 }
	}

}
