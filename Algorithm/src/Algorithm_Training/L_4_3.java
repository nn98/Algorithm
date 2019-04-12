package Algorithm_Training;

public class L_4_3 {

	static String toDecimalString(int value) {
		String r="";
		return r;
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 100000000; i *= 9) {
			String s = toDecimalString(i);
			System.out.printf("%9d %s\n", i, s);
		}
	}


}
