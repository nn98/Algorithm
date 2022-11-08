package TA;

class MyLinkedList{
	private Node head;
	private int numItems;

	private class Node{
		int data;
		Node link;
	}
	public MyLinkedList(){
		head = null;
		numItems = 0;
	}
	public void addFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = head;
		head = newNode;
		numItems++;
	}
	public void addLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
		numItems++;
	}
	public boolean contains(int data) {
		
		if(numItems == data){
			return true;
		}
		else {
			return false;
		}
	}
	public int size() {
		return numItems;
	}
	public int removeFirst() {
		if(head == null) {
			throw new java.util.NoSuchElementException();
		}
		else {
			Node node = head.link;
			head.link = node.link;
			int result = node.data;
			node = null;
			numItems--;
			return result;
		}
	}
	public int removeLast() {
		if(head == null) {
			throw new java.util.NoSuchElementException();
		}
		else if(head.link == null) {
			return removeFirst();
		}
		else {
			Node current = head;
			Node previous = null;
			while(current.link != null) {
                System.out.println("Run");
				previous = current;
			}
			current = current.link;
			previous.link = null;
		}
		return 0;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("(");
		Node temp = head;
		if(numItems > 0) {
			for(int i = 0; i < numItems - 1; i++) {
				result.append(temp.data +",");
				temp = temp.link;
			}
			result.append(temp.data);
		}
		result.append(")");
		return result.toString();
	}
}
public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("hw6_1 : 양라윤 ");
		MyLinkedList list = new MyLinkedList();

		System.out.println(list.contains(2));

		list.addFirst(1);
		list.addFirst(2);
		list.addLast(3);
		list.addLast(4);
		System.out.println(list);
		
		System.out.println(list.contains(2));
		System.out.println(list.contains(4));
		System.out.println(list.contains(6));

		System.out.println(list.size());
		
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);
		
	}

}
