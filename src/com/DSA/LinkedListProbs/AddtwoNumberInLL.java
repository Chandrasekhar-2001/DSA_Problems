package com.DSA.LinkedListProbs;

public class AddtwoNumberInLL {
	
	// TC: O(max(n1,n2)) where n1,n2 are the length of the given linkedList
	// SC: O(max(n1,n2)) where we use max length of n1,n2 to create a new LinkedList
	public static Node sumOfTwoNumber(Node head1,Node head2) {
		Node temp1 = head1, temp2=head2, dummyNode = new Node(-1);
		Node current = dummyNode;
		int carry =0;
		while(temp1 != null || temp2 != null) {
			int sum=0;
			
			if(temp1 != null) {
				sum =sum+ temp1.data;
				temp1 = temp1.next;
			}
			if(temp2 != null) {
				sum = sum+temp2.data;
				temp2 = temp2.next;
			}
			sum =sum+carry;
			Node newNode = new Node(sum%10);
			current.next =newNode;
			current = current.next;
			carry = sum/10;
		}
		if(carry !=0) {
			Node newNode = new Node(carry);
			current.next = newNode;
		}
		return dummyNode.next;
	}

	public static void main(String[] args) {
		int arr1[] = {3,5};
		int arr2[] = {4,5,9,9};
		Node head1 = BasicInLinkedList.creatLinkedList(arr1);
		Node head2 = BasicInLinkedList.creatLinkedList(arr2);
		Node newHead = sumOfTwoNumber(head1, head2);
		Node temp = newHead;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
	}

}
