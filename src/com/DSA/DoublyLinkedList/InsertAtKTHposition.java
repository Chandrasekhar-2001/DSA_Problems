package com.DSA.DoublyLinkedList;

public class InsertAtKTHposition {
	
	
	public static Node InsertAtKTHpositionINDDLL(Node head,int value,int k) {
		if(head ==null) {
			return head;
		}
		if(k==1) {
			return new Node(value,head,null);
		}
		Node temp = head, previous=null;
		int count=0 ;boolean bb= false;
		while(temp.next != null ) {
			count = count+1;
			if(k==count) {
				bb = true;
				break;
			}
			temp = temp.next;
		}
		
		if(bb || temp.next == null) {
		Node newNode = new Node(value,temp,temp.previous);
		previous = temp.previous;
		previous.next =newNode;
		temp.previous=newNode;
		}
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7};
		Node head = InsertAtHeadAndTailInDDL.createDDLinkedList(arr);
		Node temp1 = head;
		while(temp1 != null) {
			System.out.print(temp1.data+"  ");
			temp1 = temp1.next;
		}
		System.out.println();
		Node headAfterInsertion = InsertAtKTHpositionINDDLL(head,999,6);
		Node temp = headAfterInsertion;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
	}

}
