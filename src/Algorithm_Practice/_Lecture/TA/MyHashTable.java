package Algorithm_Practice._Lecture.TA;
public class MyHashTable {
	private class Node { // 연결리스트 노드 구조
		int key;
		Node link;

		Node(int key) {    //key를 입력받아 노드생성하는 생성자
			this.key = key;
			this.link = null;
		}
	}

	private Node[] table;// 테이블
	private int m; // 테이블크기
	private int n; // 원소 수
	private static final double A = 0.6180339887;

	// 1.테이블 크기를 매개변수로 받아 공백 해시테이블을 생성
	public MyHashTable(int m) {
		table = new Node[m];
		this.m = m;
		n = 0;
	}

	// 2.해시함수 - 곱하기 방법을 이용해 key의 해시값을 계산:O(1)
	private int hash(int key) {
		// key를 이용해 해시값, 즉 해시테이블 인덱스를 계산해 리턴하도록 함
		double num = m * ((key * A) % 1);
		return (int) num;
	}

	// 3.테이블에 key를 삽입 - key중복 여부는 검사하지 않아도 됨 : 평균O(1)
	public void add(int key) {
		Node newNode = new Node(key); //삽입할 노드 생성
		int i = hash(key);
		Node tmp = table[i];

		if (tmp == null) { //노드가 0개였을때 바로 삽입
			table[i] = newNode;
		} else {
			newNode.link = table[i]; //새로운노드가 먼저 테이블을 가리키게 한 다음
			table[i] = newNode; // 헤드 역할을 새로운 노드로 바꿔줌
		}
		n++;
	}

	// 4.적재율을 계산하여 리턴 : O(1)
	public double getLoadFactor() {
		// 테이블크기와 현재원소수를 이용해 적재율 계산
		double M = (double) m; //double형으로 바꿔주어야 올바른 계산 가능
		double N = (double) n;
		return N / M;
	}

	// 5.테이블에서 key를 검색해 존재하면 true리턴 : 평균 O(1)
	public boolean contains(int key) {
		// key의 해시값을 구해 그 위치의 연결리스트에서 key 값을 검색
		int i = hash(key);
		Node temp = table[i];
		boolean result = false; // true로 바뀌지 않으면 false출력
		
		while (temp != null) {
			if (temp.key == key) { // 같을시 true로 바꿔주고 반복문 break
				result = true;
				break;
			} else { //다르면 그 다음 노드의 키를 보기위해 넘어감
				temp = temp.link;
			}
		}
		return result;
	}

	public void printTable() {
		for (int i = 0; i < table.length; i++) {
			System.out.print("table[" + i + "]=");
			Node temp = table[i];
			while (temp != null) {
				System.out.print(temp.key + " ");
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
