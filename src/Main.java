import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		System.out.println("hw5_1 : 김예훈");
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int i =1; i<11; i++)
			list1.add(i);


		System.out.println(list1);
		list1.add(10,777);
		list1.add(0,888);
		list1.add(5,999);
		System.out.println(list1);
		int sum=list1.remove(12);
		sum+=list1.remove(4);
		sum+=list1.remove(0);
		System.out.println(list1 + " 삭제원소합 = "+sum);
		System.out.println();

		//		
		MyArrayList list2 = new MyArrayList(100);
		for (int i =1; i<11; i++)
			list2.add(i);
		System.out.println(list2);
		list2.add(10,777);
		list2.add(0,888);
		list2.add(5,999);
		System.out.println(list2);
		sum=list2.remove(12);
		sum+=list2.remove(4);
		sum+=list2.remove(0);
		System.out.println(list2 + " 삭제원소합 = "+sum);
		System.out.println();
	}

}

class MyArrayList{
	private int[] listArray;
	private int listLength;

	public MyArrayList(int capacity) {
		listArray = new int[capacity];
		listLength=0;
	}

	public void add(int item) {
		listArray[listLength++] = item;
	}

	public void add (int i,int j) {
		for(int y=listLength; y>i; y--) {
			listArray[y] = listArray[y-1];
		}
		listArray[i] = j;
		listLength++;
	}

	public int remove(int i) {
		int d = listArray[i]; 
		for(int j = i; j< listLength-1; j++)
			listArray[j] = listArray[j+1];
		listLength--;
		return d;
	}

	@Override 
	public String toString() {
		String result = "(";
		for(int i =0; i<listLength-1; i++) {
			result+=listArray[i];
			result+=", ";
		}
		result+= listArray[listLength-1];
		result+=")";
		return result;

	}
}
