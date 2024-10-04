package com.DSA.DoublyLinkedList;

import java.util.Stack;

public class ReverseOfDobulyLinkedlist {
	
	// time complexity is O(2N) since we are using two while loops
	// space complexity is O(N) since an external stack is used to store elements	
	public static Node reverseOfDoublyLinkedList(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Stack<Integer> stack = new Stack();
		Node temp = head;
		while(temp!=null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		
		 temp =head;
		while(temp!=null) {
			temp.data=stack.peek();
			stack.pop();
			temp = temp.next;
		}
		return head;
	}
	
	//time complexity O(n) and Space complexity O(1)
	public static Node reverseOfDDLLOptimisedSol(Node head) {
		if(head ==null || head.next ==null) {
			return head;
		}
		Node current=head,last =null;
		while(current != null) {
			last = current.previous;
			current.previous = current.next;
			current.next = last;
			current = current.previous;
		}
	return last.previous;
	}
	
	// we are going to get the reverse order but not reversing the given DDLL
	public static Node sortCutToGetInReverseDDLL(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node temp = head,tail=null;
		while(temp!=null) {
			tail = temp;
			temp =temp.next;
			
		}
		return tail;
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Node head = InsertAtHeadAndTailInDDL.createDDLinkedList(arr);
		Node head1 =reverseOfDoublyLinkedList(head);
		Node temp = head1;
		while(temp !=null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println();
		Node head2 = InsertAtHeadAndTailInDDL.createDDLinkedList(arr);
		Node newHead = reverseOfDDLLOptimisedSol(head2);
		Node temp2 = newHead;		
		while(temp2 != null) {
			System.out.print(temp2.data+"  ");
			temp2 = temp2.next;
		}
		System.out.println();
		Node head3 = InsertAtHeadAndTailInDDL.createDDLinkedList(arr);
		Node newHeadSotCut = sortCutToGetInReverseDDLL(head3);
		Node temp3 = newHeadSotCut;		
		while(temp3 != null) {
			System.out.print(temp3.data+"  ");
			temp3 = temp3.previous;
		}
	}

}
