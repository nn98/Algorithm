
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		System.out.println("hw6_1 : 황창훈");
		
		//(1)
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("초기 상태 = " + list1);
		
		//(2)
		for(int i = 1; i<=10; i++) {
			list1.add(i*10);
		}
		System.out.println("삽입 후 = " + list1);
		
		//(3)
		int[] indexArray = {9, 4, 3, 6, 0, 0, 0, 0, 1, 0};
		//삭제할 인덱스를 순서대로 indexArray에 저장한다.
		System.out.print("삭제원소 = ");
		for(int i : indexArray) {//indexArray를 i가 돌며 i번째 원소를 삭제한다.
			System.out.print(list1.remove(i));//remove()의 반환을 받아서 출력한다.
			System.out.print(" ");	
		}
		System.out.println();
		
		System.out.println("삭제 후 = " + list1);
		System.out.println();
		
		//(4)
		MyLinkedList list2 = new MyLinkedList();
		System.out.println("초기상태 = " + list2);
		
		//(5)
		for(int i = 1; i<=10; i++) {
			list2.add(i*10);
		}
		System.out.println("삽입 후 = " + list2);
		
		//(6)
		System.out.print("삭제원소 = ");
		for(int i : indexArray) {//indexArray를 i가 돌며 i번째 원소를 삭제한다.
			System.out.print(list2.remove(i));//remove()의 반환을 받아서 출력한다.
			System.out.print(" ");	
		}
		System.out.println();
		
		System.out.println("삭제 후 = " + list2);
		System.out.println();
		
		
	}

}
