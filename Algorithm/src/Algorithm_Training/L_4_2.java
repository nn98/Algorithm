package Algorithm_Training;

import java.util.Arrays;

// % 15
public class L_4_2 {
	
	static final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
	static String toHexString(int value) {
		StringBuilder builder = new StringBuilder();
		for (int i = 28; i >= 0; i -= 4) {
			int d = (value >> i) & 0xF;
			builder.append(HEX_DIGITS[d]);
		}
		return builder.toString();
	}
	static String toHexString0(int value) {
		String r="";
		int arr[]=new int[8];
		for(int i=7;i>=0;i--) {
			int j=value>>i*4&15;
			if(j>9) {
				r+=String.format("%c", 'A'+(j-10));
			}
			else
				r+=j;
			// arr[i]=j;
		}
		// System.out.println(Arrays.toString(arr));
		return r;
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 100000000; i *= 10) {
			String s = toHexString(i);
			String s1 = toHexString0(i);
			System.out.printf("%9d %s %s\n", i, s, s1);
		}
	}
}
