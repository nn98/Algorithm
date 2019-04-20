package Algorithm03;
import java.util.Arrays;

public class Example4 {
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	static void swap(int[] a, int i, int j) {
		int v=a[i];
		a[i]=a[j];
		a[j]=v;
	}
	// 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
	static int findMin(int[] a, int start) {
		int v=a[start],r=start;
		for(int i=start;i<a.length;i++) {
			if(v>a[i]) {
				v=a[i];
				r=i;
			}
		}
		return r;
	}
	// selection sort
	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
			swap(a, i, minIndex); // 그 값을 i 위치로 이동한다
		}
	}
	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
