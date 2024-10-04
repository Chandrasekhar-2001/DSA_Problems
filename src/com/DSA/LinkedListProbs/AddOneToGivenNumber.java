package com.DSA.LinkedListProbs;

public class AddOneToGivenNumber {
	public static Node reverseOfGivenLL(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseOfGivenLL(head.next);
		Node front = head.next;
		front.next = head;
		head.next=null;
		return newHead;
	}
	public static Node addOneToGivenNumber(Node head) {
		
		Node newHead = reverseOfGivenLL(head);
		Node temp = newHead;
		int carry =1;
		
		while(temp!=null) {
			temp.data = temp.data+carry;
			if(temp.data <10) {
				carry=0;
				break;
			}else {
				temp.data =0;
				carry=1;
			}
			temp=temp.next;
		}
		if(carry == 1) {
			Node newNode = new Node(carry);
			head = reverseOfGivenLL(head);
			newNode.next = head;
			return newNode;
		}
		head = reverseOfGivenLL(head);
		return head;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,5,9};
		Node head = BasicInLinkedList.creatLinkedList(arr);
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
	}

}
