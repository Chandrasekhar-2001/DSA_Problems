package com.DSA.DoublyLinkedList;

public class InsertAtHeadAndTailInDDL {
	public static Node createDDLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i], null,mover);
			mover.next = temp;
			mover = temp;
			
		}
		return head;
	}
	public static Node InsertAtHead(Node head,int k) {
		if(head==null) {
			return new Node(k);
		}
	
		Node newHead = new Node(k,head,null);
		return newHead;
	}
	public static Node InsertAtTail(Node head,int k) {
		if(head==null) {
			return new Node(k);
		}
		Node temp = head;
		while(temp.next!=null) {
			  temp = temp.next; 
		} 
		Node newNode = new Node(k,null,temp);
		temp.next = newNode;
		 
		return head;
	}
	

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7};
		Node head = createDDLinkedList(arr);
		Node newHead = InsertAtHead(head,10);
		Node temp = newHead;
		
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println();
		 Node head2 = createDDLinkedList(arr);
		 Node headAfterinatTail = InsertAtTail(head2, 4);
		 while(headAfterinatTail !=null) {
			 System.out.print(headAfterinatTail.data+"  ");
			 headAfterinatTail = headAfterinatTail.next;
		 }
		 
	}

}
