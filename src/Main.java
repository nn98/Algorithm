
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
	System.out.println("hw6_1 : 김승규");
	
	
	//(1) Integer형 LinkedList 객체(list1)를 생성하고 리스트 출력
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	System.out.println("초기 상태 = "+list1);
	
	//(2) list1의 맨 뒤에 원소 10, 20, 30, ..., 100을 차례대로 삽입하고 리스트 출력
	int i2=10;
	for(int i=1;i<=10;i++) {
		list1.add(i2);
		i2= i2+10;
	}
	System.out.println("삽입 후 = "+list1);
			
	//(3) list1로부터 인덱스 9, 4, 3, 6, 0, 0, 0, 0, 1, 0 의 원소를 차례대로 삭제하여 출력하고 리스트 출력
	System.out.print("삭제 원소 = ");
	System.out.print(list1.remove(9)+" ");
	System.out.print(list1.remove(4)+" ");
	System.out.print(list1.remove(3)+" ");
	System.out.print(list1.remove(6)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(1)+" ");
	System.out.println(list1.remove(0)+" ");
	System.out.println("삭제 후 = "+list1);		
	System.out.println();
	
	
	// (4) MyLinkedList 객체(list2)를 생성하고 리스트 출력
	MyLinkedList list2= new MyLinkedList();
	System.out.println("초기 상태 = "+list2);
	
	
	
	//(5) list2의 맨 뒤에 원소 10, 20, 30, ..., 100을 차례대로 삽입하고 리스트 출력
	for(int i=10;i<=100;i+=10)
		list2.add(i);
	
	System.out.println("삽입 후 = "+list2);
	
	
	//(6) list2로부터 인덱스 9, 4, 3, 6, 0, 0, 0, 0, 1, 0 의 원소를 차례대로 삭제하여 출력하고 리스트 출력
	System.out.print("삭제 원소 = ");
	System.out.print(list2.remove(9)+" ");
	System.out.print(list2.remove(4)+" ");
	System.out.print(list2.remove(3)+" ");
	System.out.print(list2.remove(6)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(1)+" ");
	System.out.println(list2.remove(0)+" ");

	
	System.out.println("삭제 후 = "+list2);
}


}

