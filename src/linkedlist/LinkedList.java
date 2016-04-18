package linkedlist;

public class LinkedList {
	Node head ;
	Node tail;
	Integer size = 0;
	
	//Create a blank linked list
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	//Create a linked list with a start node
	public LinkedList(Integer value) {
		Node firstNode = createNode(value, null);
		head = firstNode;
		tail = firstNode;
		this.size ++;
	}
	
	//Insert a node into list. Inserts at the end.
	public void insert(Integer value){
		Node newNode = createNode(value, null);
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.setNext(newNode);
			tail = newNode;
		}
		this.size ++;
	}
	
	public void printList(){
		if(head == null)
			System.out.println("Blank list. Please enter some items");
		else{
			Node current = this.head;
			while(true){
				System.out.print(current.getValue() + " ");
				if(current.getNext() != null)
					current = current.getNext();
				else
					break;
			}
		}
	}
	
	private Node createNode(Integer value, Node next){
		Node node = new Node();
		node.setValue(value);
		node.setNext(next);
		return node;
	}
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public Integer getSize() {
		return size;
	}
}
