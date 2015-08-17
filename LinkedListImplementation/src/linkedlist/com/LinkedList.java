package linkedlist.com;

import java.util.Stack;

public class LinkedList {
	Node head;
	Node evenHead;
	Node oddHead;
	int listCount;

	public LinkedList() {
		head = new Node(0);
		evenHead = new Node(0);
		oddHead = new Node(0);

		listCount = 0;
	}

	// add Node in the end
	public void addInTheEnd(int data) {
		// create a node
		Node temp = new Node(data);
		Node current = head;
		// crawl linked list till end
		while (current.getNext() != null) {
			current = current.getNext();
		}
		// set new node to end
		current.setNext(temp);
		listCount++;

	}

	// add node at he particular index
	public void addAtParticularIndex(int data, int index) {
		if (index < 0) {
			throw new IllegalArgumentException("Not a valid index");
		}
		// create a node
		Node temp = new Node(data);
		Node current = head;
		for (int i = 0; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		if (current.getNext() == null) {
			throw new IllegalArgumentException("Not a valid index");
		}
		// set new node to end
		temp.setNext(current.getNext());
		current.setNext(temp);
		listCount++;

	}

	// traverse and print the linked list
	public int[] printLinkedList() {
		int[] nodeArray = new int[listCount];
		Node current = head.next;
		for (int i = 0; current != null; i++) {
			nodeArray[i] = current.getData();
			current = current.getNext();
		}
		return nodeArray;

	}

	// get the data from particular node

	public int getDataFromParticularIndex(int index) {
		Node current = head;
		for (int i = 0; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		int node = current.getNext().getData();
		return node;

	}

	// remove the data from particular index
	public int removeNodeFromParticularIndex(int index) {
		Node current = head;
		for (int i = 0; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		Node removedNode = current.getNext();
		current.setNext(current.getNext().getNext());
		listCount--;
		return removedNode.data;

	}
	
	// Reverse the linked list
	public Node reverseLinkedList() {
		// check if linked list is empty
		if (head.getNext() == null) {
			return null;
		
		}
		Node current = head.next;
		Node previous = null;
		Node previousRunner = null;
		while (current != null) {
			previous = current;
			current = current.next;
			previous.next = previousRunner;
			previousRunner = previous;
		}
		head.next = previous;
		return head;
	}



	// find Middle Node
	public int findMiddleNode() {
		Node current = head.next;
		Node previous = head.next;
		while (current!= null && current.next!=null) {			
				previous = previous.next;
					current = current.next.next;
			}
		return previous.getData();

	}

	// find nth last Node
	public int findNthLastNode(int n) {
		// if negative n value
		if (n < 0) {
			throw new IllegalArgumentException("invalid value of n");
		}
		int count = 0;
		Node current = head;
		Node previous = head;
		while (current.next != null) {
			current = current.next;
			count++;
			if (count >= n) {
				previous = previous.next;
			}
		}
		// check if n value is greater than the length of the list
		if (count < n) {
			throw new IllegalArgumentException("invalid value of n");
		}
		return previous.getData();

	}

	// sort even odd and merge evens after odd
	public Node mergeEvenAfterOdds() {
		Node evenCurrent = evenHead;
		Node oddCurrent = oddHead;
		Node current = head;
		// if no node is present in the list
		if (current.getNext() == null) {
			return head;
		}
		while (current.next != null) {
			current = current.next;
			// if odd
			if (current.getData() % 2 != 0) {
				oddCurrent.setNext(current);
				oddCurrent = oddCurrent.next;
			} else {
				evenCurrent.setNext(current);
				evenCurrent = evenCurrent.next;
			}
		}
		// no even nodes are present
		if (evenHead.getNext() == null) {
			return oddHead.getNext();
		}
		// no odd nodes are present
		else if (oddHead.getNext() == null) {
			return evenHead.getNext();
		}
		// if both odd and even are present
			evenCurrent.setNext(null);
			oddCurrent.setNext(evenHead.getNext());
			return oddHead.getNext();

	}
	
	public int[] printLinkedListAfterMerging() {
		int[] nodeArray = new int[listCount];
		Node current = oddHead.next;
		int i =0;
		while(current != null)  {
			nodeArray[i] = current.data;
			current = current.getNext();
			i++;
		}
		return nodeArray;

	}
	
	//find if 

}
