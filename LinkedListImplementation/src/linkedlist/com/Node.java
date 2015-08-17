package linkedlist.com;

public class Node {
	Node next;
	int data;
	
	public Node(int data){
		next = null;
		this.data = data;
				
	}
	
	public Node(int data, Node next){
		this.next = next;
		this.data = data;
	}
	
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
}
