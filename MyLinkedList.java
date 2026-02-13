
public class MyLinkedList {
	
	// Node class to represent each element in the linked list
	class Node {
		int data;
		Node next;
		
		Node (int d) {
			data = d;
			next = null;
			
		}
	}
	
	
	// head of the list 
	Node head = null;
	
	// Insert  at the beginning
	public void insertAtBeginning(int x) {
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
}
	// Insert at the end 
	public void insertAtEnd(int x) {
		Node newNode = new Node(x);
		
		if(head == null) {
			head = newNode;
			return;
			
		}
		
		Node temp = head; 
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Delete a node by key (value)
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		// If head itself holds the key
		if (temp!= null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		// Search the key 
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
			
		}
		
		// If key was not found 
		if (temp == null) {
			System.out.println("Value " + key + " not found in list.");
			return;
		}
		
		// Unlink node
		prev.next = temp.next;
		
	}
	
	// Print the linked list
	public void printList() {
		Node temp = head;
		System.out.print("Linked List: ");
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
			
		}
		System.out.println("null");
	}
	
	// MAIN for testing 
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		// Manually add 5 integers
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		
		// Print initial list
		list.printList();
		
		// Test insertAtBeginning
		list.insertAtBeginning(5);
		list.printList();
		
		// Test insertAtEnd
		list.insertAtEnd(60);
		list.printList();
		
		// Test deleteNode
		
		list.deleteNode(30); // removes 30
		list.printList();
		
		list.deleteNode(100); // not in the list (shows message)
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	