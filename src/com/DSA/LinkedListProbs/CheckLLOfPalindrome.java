package com.DSA.LinkedListProbs;

public class CheckLLOfPalindrome {
	public static Node reverseOfLinkedList(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node newHead = reverseOfLinkedList(head.next);
		Node front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
	}
	
	//TC: O(2N) , SC:O(1)
	public static boolean verifyLLOfPalindrome(Node head) {
		if(head == null || head.next == null) {
			return true;
		}
		// To get the middle of the LinkedList
		Node slow =head,fast = head;
		while(fast.next != null && fast.next.next !=null) {
			slow=slow.next;
			fast = fast.next.next;
		}
		
		// Reverse the second part of the LinkedList
		Node newHead = reverseOfLinkedList(slow.next);
		Node first = head , second =newHead;
		
		// Compare first and second part of the LinkedList
		while(second!=null) {
			if(first.data != second.data) {
				reverseOfLinkedList(newHead);
				return false;
			}
			first = first.next;
			second = second.next;
		}
		reverseOfLinkedList(newHead);
		return true;
	}
	public static void main(String[] args) {
			int arr[] = {1,2,3,3,2,1};
			Node head = BasicInLinkedList.creatLinkedList(arr);
			System.out.println(verifyLLOfPalindrome(head));
	}

}
