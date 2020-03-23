package Algorithm_03_1;

import java.util.Arrays;
public class Example6 {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	// bubble sort
	static void bubbleSort(int[] a) {
		for (int i = a.length - 1; i >= 1; --i) {
			boolean crush = true;
			for (int j = 0; j < i; ++j) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					crush = false;
				}
			}
			if (crush) break;
		}
	}
	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}