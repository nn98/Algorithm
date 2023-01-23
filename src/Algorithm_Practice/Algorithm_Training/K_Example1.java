package Algorithm_Training;

public class K_Example1 {

	static Integer getMaxValue(Integer[] a) {
		Integer max = a[0];
		for (int i = 1; i < a.length; ++i)
			if (a[i].compareTo(max) > 0)
				max = a[i];
		return max;
	}
	static Double getMaxValue(Double[] a) {
		Double max = a[0];
		for (int i = 1; i < a.length; ++i)
			if (a[i].compareTo(max) > 0)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a1 = { 2, 5, 1, 7, 4, 3, 6, 8 };
		Integer i = getMaxValue(a1);
		System.out.println(i);
		Double[] a2 = { 2.2, 5.5, 1.1, 7.7, 4.4, 3.3, 6.6, 8.8 };
		Double d = getMaxValue(a2);
		System.out.println(d);
	}

}
