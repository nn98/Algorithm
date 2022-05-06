
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("hw6_1: 백승민");
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();//리스트 생성
		System.out.println("초기 상태 = " + list1);
		
		for(int i = 1; i<=10; i++) {
			list1.add(i*10);//10~100까지 리스트에 입력
		}
		System.out.println("삽입 후 = " + list1);
		
		System.out.println("삭제 원소 = " + list1.remove(9) +" "+ list1.remove(4) +" "+ list1.remove(3) +" "+ list1.remove(6)+" "+
		list1.remove(0) +" "+ list1.remove(0) +" "+ list1.remove(0) +" "+ list1.remove(0) +" "+ list1.remove(1) +" "+ list1.remove(0));
		//정해진 순서대로 제거하고 그 값을 반환
		System.out.println("삭제 후 = " + list1);
		System.out.println();
		
		MyLinkedList2 list2 = new MyLinkedList2(); // list2 생성
		System.out.println("초기상태 = " + list2);
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
		//리스트 원소들을 하나의 문자열로 만들어 리턴
		@Override
		public String toString() {
			String result = "";//반환할 문자열이 저장될 변수
			Node temp = head;//반환될 데이터를 가리키는 노드
			
			result += "(";
			
			if(listLength > 0) {//list가 공백 리스트가 아니라 나타낼 원소가 있는 경우
				for(int i = 0; i<listLength-1; i++) {//리스트의 마지막 원소를 제외하고
					result += temp.data + ",";//원소를 반환할 변수 result에 붙인다.
					temp = temp.link;//이후 temp가 다음 노드를 가리키게 한다.
				}
				result+=temp.data;//리스트의 마지막 원소를 변수 result에 붙인다.
			}
			result+=")";
			return result;
		}
		
		public void add(int item) {
			
		}
	}

}



