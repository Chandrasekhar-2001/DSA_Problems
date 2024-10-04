package com.DSA.LinkedListProbs;

public class Sort012InLinkedList {
	
	//TC : O(2N) , SC =O(1);
	public static Node sort012(Node head) {
		if(head==null) {
			return head;
		}
		Node temp=head;
		int count0=0,count1=0,count2=0;
		while(temp !=null) {
			if(temp.data ==0) {
				count0=count0+1;
			}else if(temp.data ==1) {
				count1=count1+1;
			}else {
				count2 = count2+1;
			}
			temp = temp.next;
		}
		temp=head;
		while(temp != null) {
			if(count0 >0) {
				temp.data=0;
				count0=count0-1;
			}else if(count1 >0) {
				temp.data=1;
				count1=count1-1;
			}else if(count2 >0){
				temp.data=2;
				count2=count2-1;
			}
			temp=temp.next;
		}
		return head;
	}
	
	public static Node sort012INLLOptSol(Node head) {
		if(head ==null || head.next ==null) {
			return head;			
		}
		Node temp =head;
		Node dummy0 =new Node(-1);
		Node dummy1 =new Node(-1);
		Node dummy2 =new Node(-1);
		Node zero=dummy0;
		Node one=dummy1;
		Node two=dummy2;
		
		while(temp!=null) {
			if(temp.data ==0) {
				zero.next=temp;
				zero=zero.next;
			}else if(temp.data ==1) {
				one.next=temp;
				one=one.next;
			}else {
					two.next=temp;
					two=two.next;
			}
			temp = temp.next;
		}
		
		zero.next = (dummy1.next!=null)?dummy1.next:dummy2.next;
		one.next = dummy2.next;
		two.next = null;
		Node newHead =dummy0.next;
		return newHead;
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,2,1,0,1};
		Node head = BasicInLinkedList.creatLinkedList(arr);
		Node newHead = sort012(head);
		Node temp = newHead;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp =temp.next;
		}
		System.out.println();
		Node head2 = BasicInLinkedList.creatLinkedList(arr);
		Node newHead2 =  sort012INLLOptSol(head2);
		Node temp2 = newHead2;
		while(temp2 != null) {
			System.out.print(temp2.data+"  ");
			temp2 = temp2.next;
		}
		
	}

}
