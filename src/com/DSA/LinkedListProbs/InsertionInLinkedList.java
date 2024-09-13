package com.DSA.LinkedListProbs;

public class InsertionInLinkedList {
	public static Node createLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	public static Node insertatHead(Node head,int value) {
		if(head==null) {
			return new Node(value);
		}
		Node temp = head;
		Node newHeap = new Node(value);
		newHeap.next=temp;
		return newHeap;
	}
	public static Node insertatTail(Node head, int value) {
		if(head==null) {
			return new Node(value);
		}
		Node temp = head,previous=null;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next=new Node(value);
		return head;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,2,66,77,88,9};
		Node head = createLinkedList(arr); // we can utilize the existing written method if required
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp= temp.next;
		}
		System.out.println();
		Node newHeap = insertatHead(head,44);
		Node newTemp = newHeap;
		while(newTemp != null) {
			System.out.print(newTemp.data+"  ");
			newTemp = newTemp.next;
		}
		System.out.println();
		Node newTail = insertatTail(head,100);
		while(newTail != null) {
			System.out.print(newTail.data+"  ");
			newTail = newTail.next;
		}
	}
}
