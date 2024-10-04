package com.DSA.LinkedListProbs;

public class RemoveNthNodeFrmEnd {
	public static Node removeNthNodeFrmEnd(Node head,int position) {
		if(head == null) {
			return null;
		}
		Node fast=head;
		int count =position;
		while(fast!=null && count!=0) {
			fast = fast.next;
			count--;
		}
		if(fast == null) {
			Node newHead = head.next;
			return newHead;
		}
		Node slow =head;
		while(fast.next !=null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next =slow.next.next;
		return head;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Node head = BasicInLinkedList.creatLinkedList(arr);
		Node newHead = removeNthNodeFrmEnd(head,2);
		Node temp = newHead;
		while(temp!= null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}

}
