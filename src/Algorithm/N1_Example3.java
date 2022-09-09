package Algorithm;

public class N1_Example3 {

	static class Node {
		int value;
		Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		public void printAll() {
			Node n=this;
			while(n!=null) {
				System.out.print(n.value+" ");
				n=n.next;
			}
		}
		public void printAll2() {
			System.out.print(value+" ");
			if(next!=null) next.printAll2();
		}
	}
	public static void main(String[] args) {
		Node root = null;
		for	(int i = 1; i <= 10; ++i)
			root = new Node(i, root);
		root.printAll();
		root.printAll2();
	}


}
