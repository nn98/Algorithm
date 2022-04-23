
public class MyLinkedList {
	private Node head;
	private int listLength;

	// 노드 구조를 표현하는 클래스
	private class Node {
		int data;
		Node link;
	}

	public MyLinkedList() {
		head = null;
		listLength = 0;
	}
	public Node node(int index) {
		Node x = head;
		for(int i = 0; i<index; i++) {
			x = x.link;
		}
		return x;
	}

	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = null;
		if (head == null) {// 시작이 null이면
			head = newNode;
			listLength++;
		} else {// 비어있지 않으면
			Node temp = head;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
			listLength++;
		}
	}

	public int remove(int index) {

		if (index == 0) { // 첫번쩨 이면
			Node temp = head;
			head = head.link;
			int data = temp.data;
			temp = null;
			listLength--;
			return data;
		} 
		Node temp = node(index-1);
		Node delData = temp.link;
		int returnData = delData.data; //삭제할값 리턴
		while(temp.link!=null)temp=temp.link;
		temp.link=delData.link;
		delData = null;
		listLength--;
		return returnData;
	}

	// 리스트 원소들을 하나의 문자열로 만들어 ()형식으로 이턴.
	@Override
	public String toString() {
		String result = ""; // 반환될 문자열이 저장될 변수 result
		Node temp = head;// 반환될 데이터를 가리키는 노드 temp

		result += "(";

		if (listLength > 0) {// list가 공백리스트가 아니라 나타낼 원소가 있는 경우
			for (int i = 0; i < listLength - 1; i++) {
				result += temp.data + ", "; // 원소를 반환될 변수 result에 붙인다.
				temp = temp.link;// 이후 temp가 다음 노드를 가리키게 한다
			}
			result += temp.data;// 리스트의 마지막 원소를 변수 result에 붙인다.
		}
		result += ")";
		return result;
	}
}
