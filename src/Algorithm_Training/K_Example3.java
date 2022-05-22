package Algorithm_Training;

public class K_Example3 {
	//static <T> T getMaxValue(T[] a) {
		// 아마 배열이 뭔지가 제대로 안나와서
		// 정답 
	static <T extends Comparable<T>> T getMaxValue(T[] a) {
		T max = a[0];
		for (int i = 1; i < a.length; ++i)
			if (a[i].compareTo(max) > 0) max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Integer[] a1 = { 2, 5, 1, 7, 4, 3, 6, 8 };
		Integer i = getMaxValue(a1);
		System.out.println(i);
		Double[] a2 = { 2.2, 5.5, 1.1, 7.7, 4.4, 3.3, 6.6, 8.8 };
		Double d = getMaxValue(a2);
		System.out.println(d);
	}

}
