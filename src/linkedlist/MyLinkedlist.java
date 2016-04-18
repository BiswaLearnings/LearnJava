package linkedlist;

public class MyLinkedlist {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList(10);
		myList.insert(11);
		myList.insert(23);
		myList.printList();
		System.out.println("size = " + myList.getSize());
		
	}
}
