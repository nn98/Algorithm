package Algorithm_03_1;

import java.util.Arrays;

public class Example7 {
	static void insertionSort(int[]a) {
		for	(int i = 1; i <a.length; ++i) {
			int value =a[i]; // 삽입할값 보관
			int j;
			for	(j = i - 1;j >= 0; --j) // 뒤로 이동
				if (a[j] > value)
					a[j + 1] = a[j];
				else
					break;
			a[j + 1] = value; //값 삽입
		}
	}
	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15 };
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
