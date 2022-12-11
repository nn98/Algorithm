
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("hw6_1: ��¹�");
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();//����Ʈ ����
		System.out.println("�ʱ� ���� = " + list1);
		
		for(int i = 1; i<=10; i++) {
			list1.add(i*10);//10~100���� ����Ʈ�� �Է�
		}
		System.out.println("���� �� = " + list1);
		
		System.out.println("���� ���� = " + list1.remove(9) +" "+ list1.remove(4) +" "+ list1.remove(3) +" "+ list1.remove(6)+" "+
		list1.remove(0) +" "+ list1.remove(0) +" "+ list1.remove(0) +" "+ list1.remove(0) +" "+ list1.remove(1) +" "+ list1.remove(0));
		//������ ������� �����ϰ� �� ���� ��ȯ
		System.out.println("���� �� = " + list1);
		System.out.println();
		
		MyLinkedList2 list2 = new MyLinkedList2(); // list2 ����
		System.out.println("�ʱ���� = " + list2);
	}
	static class MyLinkedList2{
		private Node head;
		private int listLength;
		
		private class Node{
			int data;
			Node link;
		}
		
		public MyLinkedList2() {
			head = null;
			listLength = 0;
		}
		//����Ʈ ���ҵ��� �ϳ��� ���ڿ��� ����� ����
		@Override
		public String toString() {
			String result = "";//��ȯ�� ���ڿ��� ����� ����
			Node temp = head;//��ȯ�� �����͸� ����Ű�� ���
			
			result += "(";
			
			if(listLength > 0) {//list�� ���� ����Ʈ�� �ƴ϶� ��Ÿ�� ���Ұ� �ִ� ���
				for(int i = 0; i<listLength-1; i++) {//����Ʈ�� ������ ���Ҹ� �����ϰ�
					result += temp.data + ",";//���Ҹ� ��ȯ�� ���� result�� ���δ�.
					temp = temp.link;//���� temp�� ���� ��带 ����Ű�� �Ѵ�.
				}
				result+=temp.data;//����Ʈ�� ������ ���Ҹ� ���� result�� ���δ�.
			}
			result+=")";
			return result;
		}
		
		public void add(int item) {
			
		}
	}

}



