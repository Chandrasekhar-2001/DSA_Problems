package com.DSA.LinkedListProbs;

public class InsertionOfKthElementInLL {
	
	public static Node insertatKthElement(Node head,int value,int position) {
		if(head==null) {
			return new Node(value);
		}
		if(position==1) {
		  return new Node(value,head);
		}
		Node temp = head;
		int count =0;
		while(temp !=null) {
			count=count+1;
			if(position-1 == count) {
				Node insert= new Node(value);	
				insert.next = temp.next;
				temp.next = insert;
			}
			temp=temp.next;
		}
		
		return head;
	}
	public static void main(String[] args) {
		int[] arr = {2,5,66,5,1,11,9};
		Node head = InsertionInLinkedList.createLinkedList(arr);
		int k =9;
		Node headAfterInst = insertatKthElement(head,200,k);
		Node temp = headAfterInst;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}

	}

}
