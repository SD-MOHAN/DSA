public class LinkedList {
	Node head;
	
	class Node{
		int data;
		Node ref;	
		
		Node(int val){
			data = val;
			ref = null;
		}
	}
	
	void Linkedlist(){
		head = null;
	}
	
	public void InsertValues(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
		}
		
		else {
			newNode.ref = head;
			head = newNode;
		}
		
	}
	
	public void InsertAtPos(int pos,int val) {
		Node newNode = new Node(val);
		
		if(pos == 0) {
			InsertValues(val);
			return;
		}
		
		else {
			Node temp = head;
			
			for(int i=1;i<pos;i++) {
				temp = temp.ref;
				if(temp == null) {
					throw new IllegalArgumentException("Invalid Position");
				}
			}
			
			newNode.ref = temp.ref;
			temp.ref = newNode;
		}
	}
	
	public void getIndex(int val) {
		Node temp = head;
	
		for(int i=0;i>=0;i++) {
			if(temp.data == val) {
				System.out.println("Pos:" + i);
				break;
			}
			temp = temp.ref;	
		}	
	}
	
	public void DeleteAtPos(int pos){
		if(pos == 0) {
			head = head.ref;
		}
		
		Node temp = head;
		Node pre = head;
		
		for(int i=0;i<pos;i++) {
			pre = temp;
			temp = temp.ref;
		}
		
		pre.ref = temp.ref;
	}
	
	public void UpdateVal(int pos,int val) {
		Node temp = head;
		
		for(int i=0;i<pos;i++) {
			temp = temp.ref;
		}
		
		temp.data = val;
	}
	
	public void reverse() {
		Node pre = null;
		Node current = head;
		Node next = head.ref;
		
		while(current != null) {
			next = current.ref;
			current.ref = pre;
			pre = current;
			current = next;
		}
		
		head = pre;
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.ref;
		}
	}
	
}

