package Algorithm_Practice._Lecture.Algorithm_03_1;

import java.util.Arrays;
public class Example1 {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
	static void swap(int[] a, int i, int j) {
		int v=a[i];
		a[i]=a[j];
		a[j]=v;
	}
	public static void main(String[] args) {
		int[] a = { 2, 4 };
		System.out.println(Arrays.toString(a));
		swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}
}