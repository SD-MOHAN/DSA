
public class DoublyLinkedList {
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		Node pre;
		
		Node(int val){
			data = val;
			next = null;
			pre = null;
		}
	}
	
	DoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	
	public void InsertVal(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		
		else {
			newNode.next = head;
			head.pre = newNode;
		}
		head = newNode;
	}
	
	public void displayforw() {
		if(head == null) {
			System.out.println("List Is Empty");
		}
		
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
		}
	}
	
	public void displayrev() {
		if(head == null) {
			System.out.println("List Is Empty");
		}
		
		else {
			Node temp = tail;
			while(temp != null) {
				System.out.print(temp.data + "  ");
				temp = temp.pre;
			}
		}
		
		
	}
}
