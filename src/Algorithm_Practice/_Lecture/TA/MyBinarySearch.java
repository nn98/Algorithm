package Algorithm_Practice._Lecture.TA;

class MyBinarySearchTree {
	//루트노드를 가르키는 변수 root
	private Node root = null;
	//노드의 구조 정의하는 클래스
	private class Node {

		int key;
		Node left;
		Node right;

		Node(int key){

			this.key=key;
		}

	}
	public Node root(){

		return root;}
	//매개변수로 받은 키 값이 트리에 존재하는지 검사
	public void contains(int key) {
		if(root ==null)
			System.out.println("false");

		else
			containsresult(root,key);}

	public int containsresult(Node node,int key) {
		if(node == null) {
			System.out.println("false");
			return 0;}
		if(key == node.key) 
			System.out.println("true");	

		else if(key < node.key) {
			containsresult(node.left, key);}
		else {
			containsresult(node.right, key);}
		return 0;





	}
	//매개변수로 받은 키 값을 트리에 삽입
	public void add(int key) {
		root=treeInsert(root,key);
	}
	//t를 루트로 하는 트리에 key를 삽입하고, 삽입 후 루트노드를 리턴하는 재귀 메소드
	private Node treeInsert(Node t, int key) {
		if(t == null) { 
			return new Node(key); // 노드가 빈 경우, 새로운 노드 삽입후 반환 
		}

		// 그렇지 않으면 순환적으로 트리를 내려감 
		if(key < t.key) {
			t.left = treeInsert(t.left, key);
		} else if(key > t.key) {
			t.right = treeInsert(t.right, key);
		}

		// 삽입 완료 후, 루트 노드 반환하며 끝 
		return t;

	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("(");
		if(root !=null ) {
			inorder(result,root);
			result.replace(result.length()-1, result.length(),"");
		
		}


		result.append(")");
		return result.toString();
	}
	//t를 루트로 하는 트리를 중순위 순회
	private void inorder(StringBuffer result, Node t) {

		if(t!=null) {
			inorder(result,t.left);
			result.append(t.key+",");
			inorder(result,t.right);
		}
		


	}
	//매개변수로 받은 키 값을 트리에서 삭제
	public void remove(int key) {
		deleteNode(root,key);
	}
	public Node deleteNode(Node root,int key) {
		if(root == null) {

			return null;
		}

		if(key < root.key)  // 키가 루트보다 작다면, 왼쪽 서브 트리에 있는 것 
			root.left = deleteNode(root.left, key);
		else if(key > root.key) // 키가 루트보다 크다면, 오른쪽 서브 트리에 있는 것 
			root.right = deleteNode(root.right, key);
		else {// 키가 루트와 같다면 이 노드가 바로 삭제할 노드
			if(root.right != null&&root.left==null)  // 1번, 2번의 경우 - 1. 단말 노드인 경우 / 2. 하나의 서브트리만 있는 경우 
				return root.right; // 널 값이면 널 반환 / 오른쪽 있으면 오른쪽 반환해서 이전의 if, else if에서의 왼쪽이든 오른쪽 노드에 붙여주는 것
			else if(root.left != null&&root.right==null) 
				return root.left; // left가 널인 경우와 동일 
			else if(root.right==null && root.right==null){
				root =null;

			

				return root;
			}

			// 3번의 경우 - 3. 두개의 서브 트리가 있는 경우 (left, right 둘 다 null 아님  
			Node temp = minValueNode(root.right); // 오른쪽 서브 트리에서 가장 작은 값(가장 왼쪽 노드)가 후계 노드 

			root.key = temp.key; // 후계 노드 값 복사(삭제할 노드의 값을 후계 노드 값으로 변경  
			root.right = deleteNode(root.right, temp.key); // 후계 노드 삭제 - 오른쪽 노드에게 가장 작은 값을 가졌던 맨 왼쪽 단말노드를 다시 deleteNode를 호출해 삭제하라고 함  
		}

		return root;

	}

	// 후계 노드 찾기 - 오른쪽 서브트리에서 가장 작은 값을 가지는 노드 반환 
	public Node minValueNode(Node node) { 
		Node currentNode = node;

		while(currentNode.left != null) {
			currentNode = currentNode.left; // 맨 왼쪽 단말 노드를 찾으러 내려감 
		}
		return currentNode;
	}


}


