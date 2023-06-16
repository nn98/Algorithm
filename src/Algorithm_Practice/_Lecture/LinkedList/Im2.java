package Algorithm_Practice._Lecture.LinkedList;

public class Im2 {
	//3) prev ���� ���� insertOrdered �޼ҵ� ���� �����ϴ�.
	static class Node {
		int value;
		Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	static class LinkedList {
		Node dummy = new Node(-1, null);
		// value�� ��ũ�� ����Ʈ ���ο� �߰��Ѵ�.
		public void addHead(int value) {
			dummy.next = new Node(value, dummy.next);
		}
		// ��ũ�� ����Ʈ���� value�� ã�Ƽ� �����Ѵ�
		public void remove(int value) {
			Node node = dummy.next; // ���� ��带 ����Ű�� ����
			Node prev = dummy; // ���� ����� �� �θ� ��带 ����Ű�� ����
			while (node != null) {
				if (node.value == value) { // ������ ��� ã��
					prev.next = node.next;
					break;
				}
				prev = node;
				node = node.next;
			}
		}
		// ���ĵ� ������ value�� ������
		public void addOrdered(int value) {
			//�� �޼ҵ带 �����϶�
		}
		public void print() {
			Node node = dummy.next;
			while (node != null) {
				System.out.printf("%d ", node.value);
				node = node.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for (int i = 1; i < 10; i += 2) {
			list.addOrdered(i);
			list.print();
		}
		for (int i = 0; i < 10; i += 2) {
			list.addOrdered(i);
			list.print();
		}
		for (int i = 1; i < 10; i += 2) {
			list.remove(i);
			list.print();
		}
		for (int i = 0; i < 10; i += 2) {
			list.remove(i);
			list.print();
		}
	}
}