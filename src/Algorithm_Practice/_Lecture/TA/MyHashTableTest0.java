package Algorithm_Practice._Lecture.TA;

public class MyHashTableTest0 {
	static class MyHashTable {
	    private class Node {
	        int key;
	        Node link;

	        Node(int key) {
	            this.key = key;
	            this.link = null;
	        }
	    }

	    private Node[] table;
	    private int m;  // 테이블 크기
	    private int n;  // 원소 수
	    private static final double A = 0.6180339887;

	    // 1. 테이블 크기를 매개변수로 받아 공백 해시테이블을 생성
	    public MyHashTable(int m) {
	        this.m = m;
	        this.table = new Node[m];
	    }

	    // 2. 해시 함수 - 곱하기 방법을 이용하여 key의 해시 값을 계산
	    public int hash(int key) {
	        return (int) (((key * A) % 1) * m);
	    }

	    public void add(int key) {
	        int hashCode = hash(key);
	        Node newNode = new Node(key);

	        if (this.table[hashCode] == null) {
	            this.table[hashCode] = newNode;
	        } else {
	            Node firstNode = this.table[hashCode];
	            while (firstNode.link != null) {
	                firstNode = firstNode.link;
	            }
	            firstNode.link = newNode;
	        }
	    }

	    public double getLoadFactor() {
	        int nodeCount = 0;

	        // 노드 방문할 때 마다 nodeCount 증가
	        for (int i = 0; i < table.length; i++) {
	            Node root = table[i];
	            if (table[i] == null) {
	                continue;
	            }

	            while (root != null) {
	            	System.out.println(root.key);
	                root = root.link;
	                nodeCount++;
	            }
	        }
	        return nodeCount / table.length;
	    }

	    public boolean contains(int key) {
	        int hashCode = hash(key);
	        Node firstNode = table[hashCode];

	        // 마지막 노드에 도달하면 반복문 종료
	        while (firstNode != null) {
	            if (firstNode.key == key) {
	                return true;
	            }

	            firstNode = firstNode.link;
	        }

	        return false;
	    }

	    // 해시 테이블 출력
	    public void printTable() {
	        for (int i = 0; i < table.length; i++) {
	            System.out.print("table[" + i + "] = ");
	            Node temp = table[i];
	            while(temp != null) {
	                System.out.print(temp.key + " ");
	                temp = temp.link;
	            }
	            System.out.println();
	        }
	    }
	}


	public static void main(String[] args) {
		System.out.println("hw7_1 : 손예진");

		// 입력 없이 실행하기 위해 해시 테이블에 저장할 key들을 배열에 다음과 같이 수록해 둠
		int[] addArray = {1, 5, 7, 9, 2, 4, 6, 8, 10, 30, 40};
		int[] searchArray = {4, 6, 8, 10, 30, 40, 1, 5, 7, 9, 2, 111, 333};

		// 테이블 크기가 8인 MyHashTable 객체를 생성(hashTable)
		MyHashTable hashTable = new MyHashTable(8);

		// hashTable에 addArray의 key를 모두 삽입
		for(int key: addArray) {
			hashTable.add(key);	
		}	

		// hashTable에 제대로 삽입되었는지 확인하기 위해 현재 테이블 상태와 적재율을 출력
		hashTable.printTable();
		System.out.println("load factor = " + hashTable.getLoadFactor());

		// hashTable에서 searchArray의 각 key를 조회하여 결과 true/false를 출력 
		for(int key: searchArray) {
			System.out.print(hashTable.contains(key) + " ");	
		}
	}
}

