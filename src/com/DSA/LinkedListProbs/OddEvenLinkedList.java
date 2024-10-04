package com.DSA.LinkedListProbs;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
	
	// this solution has O(2N) time complexity since we are traversing 2time 
	//O(n) space complexity since we are using an external list to store the elements
	public static Node oddEvenLL(Node head) {
		if(head ==null || head.next == null) {
			return head;
		}
		Node temp = head;
		List list = new ArrayList<Integer>();
		while(temp !=null && temp.next != null) {
			list.add(temp.data);
			temp=temp.next.next;
		}
		if(temp!=null) {
			list.add(temp.data);
		}
		temp =head.next;
		while(temp !=null && temp.next != null) {
			list.add(temp.data);
			temp=temp.next.next;
		}
		if(temp!=null) {
			list.add(temp.data);
		}
		
		int i=0; temp =head;
		while(temp!=null) {
			temp.data=(int) list.get(i);
			i++;
			temp = temp.next;
		}
		return head;
	}
	// TM:O(N), SC:O(1)
	public static Node oddEvenOptionedSol(Node head) {
		if(head==null || head.next ==null) {
			return head;
		}
		Node odd =head,even=head.next,evenHead =head.next ;
		while(even!=null && even.next !=null) {
			odd.next =odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even =even.next;
		}
		odd.next = evenHead;
		return head;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Node head = BasicInLinkedList.creatLinkedList(arr);
		Node newHead = oddEvenLL(head);
		Node temp =newHead;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println();
		Node head2 = BasicInLinkedList.creatLinkedList(arr);
		Node headAfterSol = oddEvenOptionedSol(head2);
		Node temp2 = headAfterSol;
		while(temp2 != null) {
			System.out.print(temp2.data+"  ");
			temp2 = temp2.next;
		}
	}

}
