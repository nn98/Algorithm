package Algorithm_Training;

public class KaKao {
	static String toBinaryString(short value) {
		String r="";
		for(int i=2048;i>=1;i/=2) {
			r+=Integer.toString(value/i);
			value%=i;
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(short i=3;i<=3000;i*=10) {
			String s=toBinaryString(i);
			System.out.printf("%5d %s\n",i,s);
		}
	}

}
