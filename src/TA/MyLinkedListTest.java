package TA;
import java.util.NoSuchElementException;


public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : 김은결");

		//(1) MyLinkedList 객체 list 생성
		MyLinkedList list = new MyLinkedList();

		// (2) 2 존재 여부
		System.out.println(list.contains(2));

		// (3) 원소 삽입, 출력
		list.addFirst(1);
		list.addFirst(2);
		list.addLast(3);
		list.addLast(4);
		System.out.println(list);

		// (4) 2, 4, 6 존재 여부 출력
		System.out.println(list.contains(2));
		System.out.println(list.contains(4));
		System.out.println(list.contains(6));

		// (5) list 길이 출력
		System.out.println(list.size());

		// (6) list의 맨 앞, 맨 뒤 원소 삭제, 두 원소의 합 출력, 리스트 출력
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);

		// (7) (6) 다시 반복
		System.out.println(list.removeFirst() + list.removeLast());
		System.out.println(list);

		list.addLast(99);
		list.addLast(99);
		list.addLast(99);
		list.addLast(99);
		System.out.println(list);

	}

}

class MyLinkedList {
	private class Node { // Node 정의
		int data;
		Node link;
	}

	private Node head; // 첫 노드를 가리킬 변수
	private int numItems; // 리스트 길이 저장 변수

	public MyLinkedList() { // 생성자
		head = null;
		numItems = 0;
	}

	public void addFirst(int data) {
		Node newNode = new Node(); // 새로운 노드 생성
		newNode.data = data; // 입력받은 data를 newNode에 저장
		newNode.link = head; // 기존에 맨 앞에 있던 노드를 newNode 뒤로 연결
		head = newNode; // 맨 처음 노드로 설정
		numItems++; // 길이 1 증가
	}

	public void addLast(int data) {
		Node newNode = new Node(); // 새로운 노드 생성
		newNode.data = data; // 입력받은 data를 newNode에 저장

		if(head == null) { // 만약 빈 리스트라면
			head = newNode; // head에 연결
		}
		else { // 아니라면
			Node temp = head; // 맨 끝을 찾을 임시 변수 생성
			while(temp.link != null) // 마지막 노드를 찾을 때가지
				temp = temp.link; // temp를 한 칸 뒤로 이동
			temp.link = newNode; // 찾은 후 newNode를 연결
		}
		numItems++; // 길이 1 증가
	}

	public boolean contains(int data) {
		Node temp = head; // 임시 변수 생성
		while(temp != null ) { // 리스트의 끝까지 돌면서
			if(temp.data == data) // 같은 데이터가 존재한다면
				return true; // 바로 true 리턴하고 함수 종료
			temp = temp.link; // 아닐 시 한 칸 뒤로 이동
		}
		return false; // 끝까지 찾았는데도 없다면 false 리턴
	}

	public int size() {
		return numItems; // 길이 변수의 값 리턴
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("("); // 여는 괄호 넣은 초기 sb 생성
		Node temp = head; // 임시 변수
		if(numItems > 0) { // 길이가 0이 아닌 경우에만 실행
			for(int i=0; i<numItems - 1; i++) { // 마지막 노드를 제외하고
				result.append(temp.data + ", "); // 데이터 뒤에 ", " 추가
				temp = temp.link; // 뒤로 한 칸 이동
			}
			result.append(temp.data); // 마지막 노드 붙이기
		}
		result.append(")"); // 닫는 괄호 붙이기
		return result.toString(); // String 변환해서 리턴
	}

	public int removeFirst() {
		if(head == null) { // 빈 리스트라면
			throw new java.util.NoSuchElementException(); // 예외 발생
		}
		else {
			int data = head.data; // 맨 앞 노드의 데이터 받아오기
			head = head.link; // 시작 변수를 뒤로 한 칸 옮김
			numItems--; // 길이 1 감소

			return data;
		}
	}

	public int removeLast() {
		int data;
		if(head == null) { // 빈 리스트라면
			throw new java.util.NoSuchElementException(); // 예외 발생
		}
		else if(head.link == null) { // 노드 한 개짜리 리스트라면
			data = head.data; // head에 저장된 값 받아옴
			head = null; // null 리스트로 바꿈
			numItems--; // 길이 1 감소
			return data;
		}
		else {
			Node temp = head; // 임시 변수
			for(int i=0; i<numItems-1; i++) // 논리적으로 존재하는 리스트 내에서
				temp = temp.link; // 한 칸씩 뒤로 옮김
			data = temp.data; // 리턴할 값 받아오기
			temp.link = null;
			numItems--; // 길이 1 감소
			return data;
		}
	}
}