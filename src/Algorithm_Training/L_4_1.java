package Algorithm_Training;

public class L_4_1 {

	static String toBinaryString(short value) {
		/*
		 * 
		int[] array = new int[8];
        int iattr = (int) ((byte) n & 0xFF);
        int bitWise = 1;
        for (int i = 0; i < 8; i++) {
               if ((bitWise & iattr) > 0) array[i] = 1;
               else  array[i] = 0;
         bitWise = (bitWise << 1) & 0xfe;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) sb.append(array[7 - i]);
        return sb.toString();
		 */
		String r="";
		for(int i=16;i>=0;i--) {
			r+=value>>i&1;
		}
		return r;
	}
	public static void main(String[] args) {
		for (short i = 3; i <= 3000; i *= 10) {
			String s = toBinaryString(i);
			System.out.printf("%5d %s\n", i, s);
		}
	}


}
