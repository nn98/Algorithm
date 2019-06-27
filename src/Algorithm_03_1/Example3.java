package Algorithm_03_1;

public class Example3 {
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
	public static void main(String[] args) {
		int[] a = { 14, 11, 13, 15 };
		for (int i = 0; i < a.length; ++i) {
			int minIndex = findMin(a, i);
			System.out.println(a[minIndex]);
		}
	}
}