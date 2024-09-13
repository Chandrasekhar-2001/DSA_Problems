package com.DSA.LinkedListProbs;

public class DeletionOfKthElementLinkedList {
	public static Node creatLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover =head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	public static Node removeKthElementInLL(Node head, int k) {
		if(head == null) {
			return head;
		}
		if(k==1) {
			Node temp = head;
			head = head.next;
			return head;
		}
		int count=0;
		Node temp = head,previous =null;
		while(temp != null) {
			count=count+1;
			if(k==count) {
				previous.next=previous.next.next;
				break;
			}
			previous = temp;
			temp = temp.next;
		}
		
		return head;	
	}
	public static void main(String[] args) {
		int[] arr = {6,3,22,8,99,1,7};
		Node head = creatLinkedList(arr);
		int k=2;
		Node head1 =removeKthElementInLL(head,k);
		Node temp = head1;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
	}
}
