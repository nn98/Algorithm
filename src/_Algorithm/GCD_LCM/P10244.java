package _Algorithm.GCD_LCM;

public class P10244 {

	static int t;
	static int o(int a,int b) {
		while(b>0) {
			t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(o(17,3));
	}

}
