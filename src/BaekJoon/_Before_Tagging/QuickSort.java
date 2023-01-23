package BaekJoon._Before_Tagging;

import java.util.Arrays;

public class QuickSort {
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static int partition(int[] a, int start, int end) {
		int value = a[end]; // ���ذ�
		int i = start - 1; // i�� 1������ ������
		for (int j = start; j <= end - 1; ++j) // j�� 3������ ���� ����
			if (a[j] < value) // a[j] ���� 1������ ���ϸ�
				swap(a, ++i, j); // a[j] ���� 1������ ���� �߰��Ѵ�. 1���� ũ�� 1����.
		swap(a, i + 1, end); // ���ذ��� a[end] ���ҿ� 2������ ���� ���Ҹ� ��ȯ�Ѵ�.
		return i + 1; // ���ذ� ��ġ ����
	}
	static void quickSort(int[] a, int start, int end) {
		if (start >= end) return;
		int middle = partition(a, start, end); // �迭 ������
		quickSort(a, start, middle-1); // 1���� ����
		quickSort(a, middle+1, end); // 2���� ����
	}
	public static void main(String[] args) {
		int[] a = { 31, 3, 65, 73, 8, 11 };
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}