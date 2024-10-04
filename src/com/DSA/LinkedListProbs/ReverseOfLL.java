package com.DSA.LinkedListProbs;

public class ReverseOfLL {
	//TC: O(N) since we are traversing once 
	//SC: O(1) - we did not use any external data structure to store the elements
	public static Node reverseOfLinkedList(Node head) {
	if(head == null || head.next == null) {
		return head;
	}
	Node temp = head,previous=null;
	while (temp!=null) {
		Node front =temp.next;
		temp.next = previous;
		previous=temp;
		temp = front;
	}
	return previous;
	}
	
	//TC:O(n)   , SC :O(n) - it is storing in the recursive stack place
	public static Node reverseOfLLUsingRecursion(Node head) {
		if(head == null || head.next==null) {
			return head;
		}
		Node newHead = reverseOfLLUsingRecursion(head.next);
		Node front =head.next;
		front.next=head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Node head = BasicInLinkedList.creatLinkedList(arr);
		Node newHead = reverseOfLinkedList(head);
		Node temp = newHead;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println();
		Node head2 = BasicInLinkedList.creatLinkedList(arr);
		Node headAfterRecurCall = reverseOfLLUsingRecursion(head2);
		Node temp2 = headAfterRecurCall;
		while(temp2 !=null) {
			System.out.print(temp2.data+"  ");
			temp2= temp2.next;
		}
	}

}
