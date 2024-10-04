package com.DSA.DoublyLinkedList;

class Node{
	int data;
	Node next;
	Node previous;
	Node(int data1){
		this.data = data1;
		this.next = null;
		this.previous = null;
	}
	Node(int data1,Node next1,Node previous1){
		this.data = data1;
		this.next = next1;
		this.previous = previous1;
	}
	
}

public class DeletionINDDLinkedList {
	// One way of creating Linkedlist using one arg constructor
	public static Node createDDLList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			temp.previous=mover;
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	//Another way of creating LinkedList using 3 org constructor
	public static Node createDoubleLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node prev = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i],null,prev);
			prev.next=temp;
			prev =temp;
		}
		return head;
	}

	//delete the head
	public static Node deleteHeadInDDL(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		Node prev = head;
		head = head.next;
		head.previous=null;
		prev.next = null;
		return head;
	}
	public static Node deleteKthElementInDDL(Node head, int k) {
		if(head == null || head.next ==null) {
			return null;
		}
		if(k==1) {
			return head = head.next;
		}
		Node temp = head,previous =null;
		int count=0;
		while(temp!=null) {
			count=count+1;
			if(k==count) {
				previous.next =previous.next.next;
				break;
			}
			previous =temp;
			temp=temp.next;
		}
		return head;
	}
	
	// delete the tail
	public static Node deleteTailInDDL(Node head) {
		if(head == null || head.next==null) {
			return null;
		}
		Node prev = head,temp=null;
		while(prev.next!=null) {
			prev=prev.next;
		}
		
		temp = prev.previous;
		temp.next =null;
		prev.previous=null;
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		// Method one of creating an Doubly LinkedList
	/*	Node head = createDDLList(arr);
		Node temp = head;
		while( temp != null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
		System.out.println();
	*/	
		Node head2 =createDDLList(arr);
		Node temp2 = head2;
		while(temp2 != null) {
			System.out.print(temp2.data+"  ");
			temp2 = temp2.next;
		}
		System.out.println();
		Node newHeap =deleteHeadInDDL(head2);
		while(newHeap != null) {
			System.out.print(newHeap.data+"  ");
			newHeap = newHeap.next;
		}
		System.out.println();
		Node head3 =createDDLList(arr);
		Node headAfterRTail =deleteTailInDDL(head3);
		while(headAfterRTail != null) {
			System.out.print(headAfterRTail.data+"  ");
			headAfterRTail = headAfterRTail.next;
		}
		System.out.println();
		Node head4 =createDDLList(arr);
		int value=1;
		Node headAfterKele =deleteKthElementInDDL(head4,value);
		while(headAfterKele != null) {
			System.out.print(headAfterKele.data+"  ");
			headAfterKele = headAfterKele.next;
		}
		

	}

}
