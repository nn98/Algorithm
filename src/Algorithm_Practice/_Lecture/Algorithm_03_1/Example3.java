package Algorithm_Practice._School.Algorithm_03_1;

public class Example3 {
	// �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
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
	public static void main(String[] args) {
		int[] a = { 14, 11, 13, 15 };
		for (int i = 0; i < a.length; ++i) {
			int minIndex = findMin(a, i);
			System.out.println(a[minIndex]);
		}
	}
}