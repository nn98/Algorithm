

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab5_1 : 박준희");
		
		//(1)
		ArrayList<Integer> list1 = new ArrayList<Integer>();//생성
		for(int i = 1; i <= 10; i++) {//반복문을 10번돌면서 삽입
			list1.add(i);
		}
		System.out.println(list1);//출력
		
		//(2)
		list1.add(10, 777);
		list1.add(0, 888);
		list1.add(5, 999);
		
		System.out.println(list1);//출력
		
		//(3)
		int removedSum = 0;//remove()로 반환된 정수를 더할 변수
		removedSum += list1.remove(12);
		removedSum += list1.remove(4);
		removedSum += list1.remove(0);
		
		System.out.print(list1);//출력
		System.out.print(" 삭제 원소 합 = ");
		System.out.println(removedSum);
		System.out.println();
		
		//(4)
		MyArrayList list2 = new MyArrayList(100);
		
		for(int i = 1; i <= 10; i++) {//반복문을 10번돌면서 삽입
			list2.add(i);
		}
		System.out.println(list2);//출력
		
		//------------------------추가 코드----------------------
		//(5)
		list2.add(10, 777);
		list2.add(0, 888);
		list2.add(5, 999);
		
		System.out.println(list2);//출력
		
		//(6)
		int myRemovedSum = 0;//remove()로 반환된 정수를 더할 변수
		myRemovedSum += list2.remove(12);
		myRemovedSum += list2.remove(4);
		myRemovedSum += list2.remove(0);
		
		System.out.print(list2);//출력
		System.out.print(" 삭제 원소 합 = ");
		System.out.println(myRemovedSum);
		System.out.println();
		
		
	}

}
