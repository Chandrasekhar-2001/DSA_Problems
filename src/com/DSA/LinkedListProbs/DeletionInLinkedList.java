package com.DSA.LinkedListProbs;


public class DeletionInLinkedList {

	/*
	 * public static Node createLinkedList(int[] arr) { Node head = new
	 * Node(arr[0]); Node mover = head; for(int i=1;i<arr.length;i++) { Node temp =
	 * new Node(arr[i]); mover.next = temp; mover = temp; } return head; }
	 */
	public static Node deleteHead(Node head) {
		if(head == null) {
			return head;
		}
		head = head.next;
		return head;
	}
	public static Node deleteTail(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next=null;
		return head;
	}
	public static void deleteKthElement() {
	
	}
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,2,1};
		Node head = BasicInLinkedList.creatLinkedList(arr);
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		// Delete the head
		Node headAfterdelHead = deleteHead(head);
		Node temp2=headAfterdelHead;
		System.out.println();
		System.out.println("Array After deleting the head");
		while(temp2 !=null) {
			System.out.print(temp2.data+"  ");
			temp2 = temp2.next;
		}
		//Deletion of tail
		Node headAfterDelTail = deleteTail(head);
		Node temp3 = headAfterDelTail;
		System.out.println();
		System.out.println("Array After deleting the Tail");
		while(temp3 != null) {
			System.out.print(temp3.data+"  ");
			temp3 = temp3.next;
		}
	}
}
