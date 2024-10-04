package com.DSA.LinkedListProbs;

public class AddTwoNumbResultInReverse {
	
	public static Node additionResultInreverse(Node head1,Node head2) {
		Node temp1=head1,temp2=head2;
		Node dummyNode = new Node(-1);
		Node current = dummyNode;
		int count=0;
		while(temp1!=null || temp2!=null) {
			int sum =count;
			if(temp1 !=null) {
				sum+=temp1.data;
				temp1=temp1.next;
			}
			if(temp2 != null) {
				sum+=temp2.data;
				temp2 = temp2.next;
			}
			Node newNode = new Node(sum%10);
			count =sum/10;
			current.next = newNode;
			current = current.next;
			
			
			
		}
		if(count !=0) {
			Node newNode = new Node(count);
			current.next =newNode;
		}
			return dummyNode.next;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {9,9,9};
		Node head1 = BasicInLinkedList.creatLinkedList(arr1);
		Node head2 = BasicInLinkedList.creatLinkedList(arr2);
		Node newNode=additionResultInreverse(head1, head2);
		Node temp = newNode;
		int count =0;
		while(temp!=null) {
			count = count+1;
			System.out.print(temp.data+"  ");
			temp= temp.next;
		}
	}

}
