package com.DSA.LinkedListProbs;

class Node{
 int data;
 Node next;
 Node(int data1){
	 this.data = data1;
 }
 Node(int data1,Node next1){
	 this.data = data1;
	 this.next = next1;
 }
}

public class BasicInLinkedList {
	// Code of linkedList which contains how to traverse , search an element and length of the linkedlist
	public static Node creatLinkedList(int[] arr){
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Node head = creatLinkedList(arr);
		Node temp = head;
		int count =0;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
			count++;
		}
		System.out.println();
		
		System.out.println("Count of the linkedlist :"+count);
		

	}

}
