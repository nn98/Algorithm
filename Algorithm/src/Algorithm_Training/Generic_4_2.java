package Algorithm_Training;

public class Generic_4_2 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static Comparable getMaxValue(Comparable[] a) {
		Comparable max = a[0];
		for (int i = 1; i < a.length; ++i)
			if (a[i].compareTo(max) > 0) max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Integer[] a1 = { 2, 5, 1, 7, 4, 3, 6, 8 };
		Integer i = (Integer)getMaxValue(a1);
		System.out.println(i);
		Double[] a2 = { 2.2, 5.5, 1.1, 7.7, 4.4, 3.3, 6.6, 8.8 };
		Double d = (Double)getMaxValue(a2);
		System.out.println(d);
	}

}
