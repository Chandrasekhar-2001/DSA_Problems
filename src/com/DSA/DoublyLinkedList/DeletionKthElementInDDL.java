package com.DSA.DoublyLinkedList;



public class DeletionKthElementInDDL {
	
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
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Node head =DeletionINDDLinkedList.createDoubleLinkedList(arr);
		int value=5;
		Node temp =deleteKthElementInDDL(head,value);
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}

	}

}
