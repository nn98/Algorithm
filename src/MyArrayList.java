import java.util.Arrays;

public class MyArrayList {
	public MyArrayList(int capacity) {
		listArray = new int[capacity];
		listLength = 0;
	}
	
	public void add(int item) {
		listArray[listLength] = item;//맨뒤에 삽입
		listLength++;//길이 증가
	}
	
	@Override
	public String toString() {
		String myArrayListString = "";//반환할 스트링 객체
		myArrayListString += "(";
		
		for(int i = 0; i < listLength - 1; i++) {//마지막에서 2번째 원소까지 반복하며 스트링에 더한다.
			myArrayListString += listArray[i];
			myArrayListString +=", ";
		}
		
		myArrayListString += listArray[listLength - 1];//마지막 원소 스트링에 더한다.
		myArrayListString += ")";
		
		return myArrayListString;
	}
	
	//------------------------추가코드--------------------------
	
	public void add(int index, int number) {//배열 index자리에 number를 삽입한다.
		listLength++;//삽입해야하므로 논리적으로 배열의 크기를 증가시킨다.
		
		for(int i = 1; i + index < listLength; i++) {//삽입할 공간을 비워 주어야한다.
			listArray[listLength - i] = listArray[listLength - i - 1];//역순으로 덮어쓴다.
			System.out.println(Arrays.toString(listArray));
			//역순으로 덮어쓰지 않으면 add(0,888)의 경우 배열이 모두 1이 되버린다.
			//listLength번째 원소를 가리키려면, listArray[listLength - 1]로 가리켜야 한다.
		}
		
		listArray[index] = number;//반복문을 돌며 비운 자리에, number를 삽입한다.
	}
	
	public int remove(int index) {//index자리의 원소를 삭제하여, 삭제한 원소를 반환한다.
		int removedNumber = listArray[index];//반환할 정수를 저장한다.
		
		for(int i = 0; index + i < listLength - 1; i++) {//배열을 축소시킨다.
			listArray[index + i] = listArray[index + i + 1];
			//원소를 지우기위해, 지울 자리부터 그 다음 자리로 덮어쓴다.
			//이번에는 []안의 숫자를 표현하기 위해, 범위가 listLength - 1 이다.
			//원래의 배열이, index의 원소가 사라지고 물리적으로 크기가 1 줄은 배열이 된다.
		}
		
		listLength--;//논리적으로도 배열의 크기를 감소시킨다.
		
		return removedNumber;//함수를 종료하며, 정수를 반환한다.
	}
	private	int[] listArray;
	private	int listLength;

}
