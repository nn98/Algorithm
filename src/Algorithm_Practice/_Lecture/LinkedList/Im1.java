package Algorithm_Practice._Lecture.LinkedList;


public class Im1 {
	static class Node {
		int value;
		Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	static class LinkedList {
		Node head = null;
		// value�� ��ũ�� ����Ʈ ���ο� �߰��Ѵ�.
		public void addHead(int value) {
			head = new Node(value, head);
		}
		// ��ũ�� ����Ʈ���� value�� ã�Ƽ� �����Ѵ�
		public void remove(int value) {
			Node node = head; // ���� ��带 ����Ű�� ����
			Node prev = null; // ���� ����� �� �θ� ��带 ����Ű�� ����
			while (node != null) {
				if (node.value == value) { // ������ ��� ã��
					if (prev == null) head = head.next; // ������ ��尡 head�̸�
					else prev.next = node.next; // ������ ��尡 head�� �ƴϸ�
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
			Node node = head;
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